package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String hobbyName;
    private int frequencyPractice;
    List<Address> addressList = new ArrayList<>();

    public Hobby(String hobbyName, int frequencyPractice) {
        this.hobbyName = hobbyName;
        this.frequencyPractice = frequencyPractice;
    }

    public void addAddress(Address address) {
        addressList.add(address);
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public int getFrequencyPractice() {
        return frequencyPractice;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    @Override
    public String toString() {
        return "Hobby name is " + hobbyName + "it can be practiced frequently, like "
                + frequencyPractice + " times a month, also the place where it can be practiced are: "
                + addressList;
    }
}





