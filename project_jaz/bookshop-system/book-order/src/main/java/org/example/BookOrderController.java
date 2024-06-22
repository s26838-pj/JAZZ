package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class BookOrderController {

    @Autowired
    private BookOrderService bookOrderService;

    @PostMapping
    public void processVisits(@RequestBody List<BookVisit> bookVisits) {
        bookOrderService.processVisits(bookVisits);
    }

    @GetMapping("/print")
    public void printOrders() {
        List<BookOrder> orders = bookOrderService.getAllOrders();
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream.beginText();
                contentStream.setLeading(14.5f);
                contentStream.newLineAtOffset(25, 750);
                contentStream.showText("Book Orders Report");
                contentStream.newLine();
                contentStream.newLine();

                for (BookOrder order : orders) {
                    contentStream.showText("Book ID: " + order.getBookId() + ", Quantity to Order: " + order.getQuantityToOrder());
                    contentStream.newLine();
                }
                contentStream.endText();
            }

            document.save("BookOrders.pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}