package com.queenskross.store.Product.Service;

import com.queenskross.store.Product.Model.Product;
import com.queenskross.store.Product.Repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo){

        this.productRepo = productRepo;
    }

    public List<Product> getProducts() {

        return productRepo.findAll();
    }

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    public Product getProduct(Long product_id) {

        return productRepo.findById(product_id).get();
    }

    public Product updateProduct(Product product)
    {
        return  productRepo.save(product);
    }

}
