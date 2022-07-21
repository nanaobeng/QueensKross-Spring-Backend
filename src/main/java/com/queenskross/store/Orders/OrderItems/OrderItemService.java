package com.queenskross.store.Orders.OrderItems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    private final OrderItemRepo orderItemRepo;

    @Autowired
    public OrderItemService(OrderItemRepo orderItemRepo){

        this.orderItemRepo = orderItemRepo;
    }


    public List<OrderItem> getOrderItems() {

        return orderItemRepo.findAll();
    }

    public OrderItem saveItem(OrderItem item){
        return (OrderItem) orderItemRepo.save(item);
    }
//
//    public List<OrderItem> getOrdersById(Integer order_id){
//        return orderItemRepo.find;
//    }
}