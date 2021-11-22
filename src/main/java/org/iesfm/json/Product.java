package org.iesfm.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Set;

public class Product {
    private int productId;
    private String name;
    private double price;
    @JsonProperty("class")
    private Set<String> tags;

    @JsonCreator
    public Product(
            @JsonProperty("productId") int productId,
            @JsonProperty("name") String name,
            @JsonProperty("price") double price,
            @JsonProperty("class") Set<String> tags) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name) && Objects.equals(tags, product.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, price, tags);
    }
}
