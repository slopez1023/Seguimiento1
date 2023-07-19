package Models;

import Models.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long id;
    private LocalDate orderdate;
    private LocalDate deliverydate;
    private String status;
    private Customer customer;

    public Order(Long id, LocalDate orderdate, LocalDate deliverydate, String status, Customer customer) {
        this.id = id;
        this.orderdate = orderdate;
        this.deliverydate = deliverydate;
        this.status = status;
        this.customer = customer;
    }
    public static List<Order> orders = new ArrayList<>();

}
