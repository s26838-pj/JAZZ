package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookOrderService {

    @Autowired
    private BookOrderRepository bookOrderRepository;

    public List<BookOrder> getAllOrders() {
        return bookOrderRepository.findAll();
    }

    public BookOrder saveOrder(BookOrder bookOrder) {
        return bookOrderRepository.save(bookOrder);
    }

    public void processVisits(List<BookVisit> bookVisits) {
        for (BookVisit visit : bookVisits) {
            int quantity = visit.getVisitCount() / 10;
            if (quantity > 0) {
                BookOrder order = new BookOrder();
                order.setBookId(visit.getBookId());
                order.setQuantityToOrder(quantity);
                bookOrderRepository.save(order);
            }
        }
    }
}