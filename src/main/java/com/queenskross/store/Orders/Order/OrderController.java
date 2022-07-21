package com.queenskross.store.Orders.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping

    public ResponseEntity<List<Order>> getOrders() {

        return ResponseEntity.ok().body(orderService.getOrders());
    }


    @GetMapping("/user/orders")
    public ResponseEntity<List<Order>> getUserOrders(@RequestBody Integer order_id) {

        return ResponseEntity.ok().body(orderService.getUserOrders(order_id));
    }

    @GetMapping(path = "/{order_id}")
    public ResponseEntity<Order> getOrder(@PathVariable("order_id") Long order_id) {
        return ResponseEntity.ok().body(orderService.getOrder(order_id));

    }

    @PostMapping("/create")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/order/create").toUriString());
        return ResponseEntity.created(uri).body(orderService.saveOrder(order));
    }


    @PutMapping("/update")
    private ResponseEntity<Order> update(@RequestBody Order order) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/order/update").toUriString());
        return ResponseEntity.created(uri).body(orderService.update(order));
    }

}
