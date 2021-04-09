package com.masai.project.BigBasketReplica.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {
    @Id
    int ItemId;
    public Items(){}

    public Items(int itemId) {
        ItemId = itemId;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    @Override
    public String toString() {
        return "Items{" +
                "ItemId=" + ItemId +
                '}';
    }
}
