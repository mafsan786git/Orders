package com.masai.project.BigBasketReplica.Entity;

import org.apache.tomcat.jni.User;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
public class Orders{
    @Id
    Integer orderId;
    // One user can have more than one order
    @ManyToOne
     Users users;
    private String placedDate;
    private String placedTime;
    private String status;
    private String deliveredTime;
    private Float totalPrice;
    private String modeOfPay;
    private String discountType;
    //Many order can be delivered to many addresses.
    private String paymentStatus;
    //@ManyToMany()
    //AddressDetails address;

    public Orders(Integer orderId, String placedDate, String placedTime, String status, String deliveredTime, float totalPrice, String modeOfPay, String discountType, String paymentStatus) {
        this.orderId = orderId;
        this.placedDate = placedDate;
        this.placedTime = placedTime;
        this.status = status;
        this.deliveredTime = deliveredTime;
        this.totalPrice = totalPrice;
        this.modeOfPay = modeOfPay;
        this.discountType = discountType;
        this.paymentStatus = paymentStatus;
    }
    public Orders()
    {

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getPlacedDate() {
        return placedDate;
    }

    public void setPlacedDate(String placedDate) {
        this.placedDate = placedDate;
    }

    public String getPlacedTime() {
        return placedTime;
    }

    public void setPlacedTime(String placedTime) {
        this.placedTime = placedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(String deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getModeOfPay() {
        return modeOfPay;
    }

    public void setModeOfPay(String modeOfPay) {
        this.modeOfPay = modeOfPay;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", placedDate='" + placedDate + '\'' +
                ", placedTime='" + placedTime + '\'' +
                ", status='" + status + '\'' +
                ", deliveredTime='" + deliveredTime + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", modeOfPay='" + modeOfPay + '\'' +
                ", discountType='" + discountType + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}


//spring.jpa.hibernate.ddl-auto =update
//spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLInnoDBDialect