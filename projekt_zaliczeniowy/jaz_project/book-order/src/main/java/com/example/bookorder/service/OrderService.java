package com.example.bookorder.service;

import com.example.bookorder.model.Order;
import com.example.bookorder.repository.OrderRepository;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public ByteArrayOutputStream generatePdfOrderReport() {
        List<Order> orders = orderRepository.findAll();

        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            PdfWriter.getInstance(document, out);
            document.open();
            document.add(new Paragraph("Order Report"));

            for (Order order : orders) {
                document.add(new Paragraph("Book ID: " + order.getBookId() + ", Quantity to Order: " + order.getQuantity()));
            }

            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return out;
    }

    public String printOrders() {
        ByteArrayOutputStream bis = generatePdfOrderReport();

        return "Zamówienie zostało wygenerowane.";
    }
}
