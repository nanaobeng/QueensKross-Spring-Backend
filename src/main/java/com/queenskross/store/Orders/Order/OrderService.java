package com.queenskross.store.Orders.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepo orderRepo;

    @Autowired
    public OrderService(OrderRepo orderRepo){

        this.orderRepo = orderRepo;
    }


    public List<Order> getOrders() {

        return orderRepo.findAll();
    }

    public Order saveOrder(Order order){
        orderRepo.save(order);
        return order;
    }

    public Order getOrder(Long order_id) {

        return orderRepo.findById(order_id).get();
    }

    public Order update(Order order)
    {
        orderRepo.save(order);
        return order;
    }

    public List<Order> getUserOrders(Integer id){
        return orderRepo.findByCustomer(id);
    }



}
