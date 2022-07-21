package com.queenskross.store.Product.Controller;


import com.queenskross.store.Auth.model.User;
import com.queenskross.store.Product.Model.Product;
import com.queenskross.store.Product.Service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/product")

public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok().body(productService.getProducts());
    }

    @GetMapping("/get/{product_id}")
    public ResponseEntity<Product> getProduct(@PathVariable("product_id") Long product_id) {
        return ResponseEntity.ok().body(productService.getProduct(product_id));
    }

    @PostMapping("/admin/save")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/product/admin/save").toUriString());
        return ResponseEntity.created(uri).body(productService.saveProduct(product));

    }

    @PutMapping("/admin/update")
    private ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/product/admin/update").toUriString());
        return ResponseEntity.created(uri).body(productService.updateProduct(product));
    }

}
