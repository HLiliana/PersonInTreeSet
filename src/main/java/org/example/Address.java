package org.example;

import java.util.ArrayList;
import java.util.List;

    public class Address {
        public static void main(String[] args) {

            List<String> address = new ArrayList<String>();
            address.add("Satul Marisel");
            address.add("PAdurea Hoia");
            address.add("Bazinul olimpic");
            address.add("Bazinul Babes");
            address.add("Malul Somesului");
            address.add("Parcul central");
            address.add("Sfantul Ion");
            //System.out.println(address.get(2)); am verificat pozitia 2 si mi-a printat "Bazinul Olimpic"

            List<String> hobbyName = new ArrayList<>();
            hobbyName.add("swimming");
            hobbyName.add("climbing");
            hobbyName.add("running");

            List<String> runningAddress = new ArrayList<>();
            runningAddress.add(address.get(0) + address.get(4) + address.get(5));

            List<String> climbingAddress = new ArrayList<>();
            climbingAddress.add(address.get(0) + address.get(1) + address.get(6));

            List<String> swimmingAddress = new ArrayList<>();
            swimmingAddress.add(address.get(2) + address.get(3));

            List<Hobby> Hobbies = new ArrayList<>();
            Hobby swimming = new Hobby(hobbyName.get(0), 3, swimmingAddress);
            Hobby climbing = new Hobby(hobbyName.get(1), 5, climbingAddress);
            Hobby running = new Hobby(hobbyName.get(2), 7, runningAddress);
            System.out.println(Hobbies);
        }
    }

