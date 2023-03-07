package org.example;

import java.util.ArrayList;
import java.util.List;
 /**  you need to store some information about people: for one person, you need a list of his/her hobbies
 *define for Hobby a class that contains
 *name of the hobby (String) – ex: cycling, swimming
 *frequency (int) – how many times a week they practice it
 *list of addresses where this hobby can be practiced (List<Address>)
  */
public class Hobby{

     private String hobbyName;
     private int hobbyFrequency;
     List<String> address;

     public Hobby(String hobbyName, int hobbyFrequency, List<String> address) {
         this.hobbyName = hobbyName;
         this.hobbyFrequency = hobbyFrequency;
         this.address = address;

     }

     public String getHobbyName() {
         return hobbyName;
     }

     public int getHobbyFrequency() {
         return hobbyFrequency;
     }

     public void setHobbyName(String hobbyName) {
         this.hobbyName = hobbyName;
     }

     public void setHobbyFrequency(int hobbyFrequency) {
         this.hobbyFrequency = hobbyFrequency;
     }


 }





