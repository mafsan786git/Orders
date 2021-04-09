package com.masai.project.BigBasketReplica.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class basket {
    @Id
    int userId;
    @ManyToOne
    Items items;
    int quantity;
    public basket(){}

    public basket(int id, int quantity) {
        this.userId = id;
        //this.itemId=itemId;
        this.quantity = quantity;
    }

    public int getId() {
        return userId;
    }

    public void setId(int id) {
        this.userId = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "basket{" +
                "id=" + userId+
                ", quantity=" + quantity +
                '}';
    }
}
