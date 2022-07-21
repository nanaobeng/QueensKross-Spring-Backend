package com.queenskross.store.Product.Repository;

import com.queenskross.store.Product.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
