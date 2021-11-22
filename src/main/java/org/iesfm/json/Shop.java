package org.iesfm.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Shop {
    private String name;
    private List<Product> catalog;
    private List<Order> orders;

    @JsonCreator
    public Shop(
            @JsonProperty("name") String name,
            @JsonProperty("catalog") List<Product> catalog,
            @JsonProperty("orders") List<Order> orders) {
        this.name = name;
        this.catalog = catalog;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Product> catalog) {
        this.catalog = catalog;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) && Objects.equals(catalog, shop.catalog) && Objects.equals(orders, shop.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, catalog, orders);
    }
}
