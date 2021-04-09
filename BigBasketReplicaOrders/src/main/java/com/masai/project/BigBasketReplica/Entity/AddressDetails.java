package com.masai.project.BigBasketReplica.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddressDetails {
    @Id
    int AddressId;
    public AddressDetails(){}
    public AddressDetails(int addressId) {
        AddressId = addressId;
    }

    public int getAddressId() {
        return AddressId;
    }

    public void setAddressId(int addressId) {
        AddressId = addressId;
    }

    @Override
    public String toString() {
        return "AddressDetails{" +
                "AddressId=" + AddressId +
                '}';
    }
}
