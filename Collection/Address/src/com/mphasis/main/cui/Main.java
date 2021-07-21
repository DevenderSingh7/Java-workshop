package com.mphasis.main.cui;

import java.util.LinkedList;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String name, String street, String city,
            String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public String toString() {
        return name + "\n" + street + "\n" +
                city + " " + state + " " + code;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Address> mailList = new LinkedList<Address>();

        // Add elements to the linked list.
        mailList.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        mailList.add(new Address("Ralph Baker", "1142 Maple Lane",
                "Mahome", "IL", "61853"));
        mailList.add(new Address("Tom Carlton", "867 Elm St",
                "Champaign", "IL", "61820"));

        // Display the mailing list.
        for(Address element : mailList)
            System.out.println(element + "\n");

        System.out.println();
    }
}


