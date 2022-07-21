package com.queenskross.store.Orders.OrderItems;


import javax.persistence.*;

@Entity
@Table(name="item")
public class OrderItem {

    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence"
    )
    @Column(
            name = "id",
            nullable = false
    )
    private Long id;

    @Column(
            name = "title",
            nullable = false,
            unique = true
    )
    private String product;
    private Float unit_cost;
    private Integer order_id;
    private Integer quantity;
    private Float total_cost;

    public OrderItem() {
    }

    public OrderItem(Long id, String product, Float unit_cost, Integer order_id, Integer quantity, Float total_cost) {
        this.id = id;
        this.product = product;
        this.unit_cost = unit_cost;
        this.order_id = order_id;
        this.quantity = quantity;
        this.total_cost = total_cost;
    }

    public OrderItem(String product, Float unit_cost, Integer order_id, Integer quantity, Float total_cost) {
        this.product = product;
        this.unit_cost = unit_cost;
        this.order_id = order_id;
        this.quantity = quantity;
        this.total_cost = total_cost;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Float getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(Float unit_cost) {
        this.unit_cost = unit_cost;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(Float total_cost) {
        this.total_cost = total_cost;
    }


    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", unit_cost=" + unit_cost +
                ", order_id=" + order_id +
                ", quantity=" + quantity +
                ", total_cost=" + total_cost +
                '}';
    }
}
