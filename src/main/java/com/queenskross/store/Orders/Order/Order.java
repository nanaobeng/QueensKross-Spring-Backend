package com.queenskross.store.Orders.Order;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )
    @Column(
            name = "id",
            nullable = false
    )
    private Long id;
    private String transaction_id;
    private Integer customer;
    private Float total_cost;
    private String address;
    private String firstname;
    private String lastname;
    private String status;
    private LocalDate timestamp;


    public Order() {
    }

    public Order(Long id, String transaction_id, Integer customer, Float total_cost, String address, String firstname, String lastname, String status, LocalDate timestamp) {
        this.id = id;
        this.transaction_id = transaction_id;
        this.customer = customer;
        this.total_cost = total_cost;
        this.address = address;
        this.firstname = firstname;
        this.lastname = lastname;
        this.status = status;
        this.timestamp = timestamp;
    }

    public Order(String transaction_id, Integer customer, Float total_cost, String address, String firstname, String lastname, String status, LocalDate timestamp) {
        this.transaction_id = transaction_id;
        this.customer = customer;
        this.total_cost = total_cost;
        this.address = address;
        this.firstname = firstname;
        this.lastname = lastname;
        this.status = status;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    public Float getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(Float total_cost) {
        this.total_cost = total_cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", transaction_id='" + transaction_id + '\'' +
                ", customer=" + customer+
                ", total_cost=" + total_cost +
                ", address='" + address + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", status='" + status + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
