package com.queenskross.store.Orders.Order;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order,Long> {

    List<Order> findByCustomer(Integer customer);
}
