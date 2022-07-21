package com.queenskross.store.Orders.OrderItems;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/order/item")
@RequiredArgsConstructor
public class OrderItemController {

    private final OrderItemService orderItemService;



    @GetMapping("/all")
    public ResponseEntity<List<OrderItem>> getOrderItems() {

        return ResponseEntity.ok().body(orderItemService.getOrderItems());

    }


    @PostMapping("/create")
    public ResponseEntity<OrderItem> saveOrderItem(@RequestBody OrderItem orderItem) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/order/item/create").toUriString());
        return ResponseEntity.created(uri).body(orderItemService.saveItem(orderItem));
    }




}