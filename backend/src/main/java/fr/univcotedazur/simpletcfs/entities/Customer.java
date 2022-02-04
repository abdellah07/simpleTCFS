package fr.univcotedazur.simpletcfs.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Customer implements Serializable {

    private String id;
    private String name;
    private String creditCard;
    private Set<Order> orders = new HashSet<>();

    public Customer() {
    }

    public Customer(String n, String c) {
        this.name = n;
        this.creditCard = c;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public void add(Order o) {
        this.orders.add(o);
    }

    public Set<Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        if (!getId().equals(customer.getId())) return false;
        if (!getName().equals(customer.getName())) return false;
        if (!getCreditCard().equals(customer.getCreditCard())) return false;
        return orders.equals(customer.orders);

    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getCreditCard().hashCode();
        return result;
    }

}
