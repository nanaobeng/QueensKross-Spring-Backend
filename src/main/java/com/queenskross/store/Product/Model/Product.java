package com.queenskross.store.Product.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String title;
    private Float price;
    private String thumbnail;
    private String size;
    private String description;
    private Integer quantity;
    private String status;
    private String category;
    private String brand;
    private String product_type;
    private LocalDate timestamp;

    public Product() {
    }

    public Product(Long id, String title, Float price, String thumbnail, String size, String description, Integer quantity, String status, String category, String brand, String product_type, LocalDate timestamp) {
        Id = id;
        this.title = title;
        this.price = price;
        this.thumbnail = thumbnail;
        this.size = size;
        this.description = description;
        this.quantity = quantity;
        this.status = status;
        this.category = category;
        this.brand = brand;
        this.product_type = product_type;
        this.timestamp = timestamp;
    }

@JsonCreator
    public Product(@JsonProperty("title") String title, @JsonProperty("price") Float price, @JsonProperty("thumbnail") String thumbnail,@JsonProperty("size") String size,@JsonProperty("description") String description,@JsonProperty("quantity") Integer quantity, @JsonProperty("status") String status, @JsonProperty("category") String category, @JsonProperty("brand") String brand,@JsonProperty("product_type")  String product_type,@JsonProperty("timestamp") LocalDate timestamp) {
        this.title = title;
        this.price = price;
        this.thumbnail = thumbnail;
        this.size = size;
        this.description = description;
        this.quantity = quantity;
        this.status = status;
        this.category = category;
        this.brand = brand;
        this.product_type = product_type;
        this.timestamp = timestamp;
    }




    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", thumbnail='" + thumbnail + '\'' +
                ", size='" + size + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", product_type='" + product_type + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
