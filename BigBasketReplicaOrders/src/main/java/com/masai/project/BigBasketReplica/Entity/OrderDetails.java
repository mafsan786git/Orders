package com.masai.project.BigBasketReplica.Entity;

import javax.persistence.*;

@Entity
public class OrderDetails {
    @Id
    private int OrderId; // Hi Jaseem
    @ManyToOne
    Orders orders;
    @ManyToOne
    Items items;
    private int itemQuantity;
    private float pricePerItem;


    public OrderDetails()
    {}
    public OrderDetails(int OrderId,int itemQuantity, float pricePerItem) {
        this.OrderId=OrderId;
        this.itemQuantity = itemQuantity;
        this.pricePerItem = pricePerItem;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public float getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(float pricePerItem) {
        this.pricePerItem = pricePerItem;
    }


    @Override
    public String toString() {
        return "OrderDetails{" +
                "OrderId=" + OrderId +
                ", orders=" + orders +
                ", itemQuantity=" + itemQuantity +
                ", pricePerItem=" + pricePerItem +
                '}';
    }
}
