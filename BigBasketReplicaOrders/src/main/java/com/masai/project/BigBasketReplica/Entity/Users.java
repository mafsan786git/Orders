package com.masai.project.BigBasketReplica.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    int userId;
    public Users(){}
    public Users(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                '}';
    }
}
