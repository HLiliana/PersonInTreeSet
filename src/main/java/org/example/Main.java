package org.example;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Comparator;
import java.util.TreeSet;


/**
 * DESCRIPTION
 * you need to store Person in a TreeSet //Person, TreeSet
 * define 2 Comparators (one for name and one for age) that will be used when creating the TreeSet
 * //ComparatorName , ComparatorAge ,
 * add Person to the TreeSet //addPerson
 * iterate through the TreeSet and print the name and the age
 * //iterateTreeSet , printNameAndAge
 * you need to store some information about people: for one person, you need a list of his/her hobbies
 * //hobbies, listOfHobbies
 * define for Hobby a class that contains//hobbyName
 * name of the hobby (String) – ex: cycling, swimming
 * frequency (int) – how many times a week they practice it //frequencyPractice
 * list of addresses where this hobby can be practiced (List<Address>)//address, listOfAdresses
 * you will use a HashMap with the following structure <Person, List<Hobby>> // HashMap <Person, List<Hobby>>
 * add some information to this map - any detail you consider relevant
 * //someInformation, relevantDetail
 * for a certain Person, print the names of the hobbies and the countries where it can be practiced
 * //printNamesOfHobbiesAndCountryForAPerson
 * use some example classes, appropriately, such as:// Person, Unemployed, Hired, Student, Address, Country
 * NOTES
 * if you are using a Comparator, the class Person should not implement Comparable anymore
 * equals() from Person must be overridden
 * <p>
 * Nouns: Person, TreeSet, Hobby, hobbyName, frequencyPractice, address, someInformation, relevantDetail
 * Verbs: ComparatorName, ComparatorAge, addPerson, iterateTreeSet, printNameAndAge,
 * printNameOfHobbyAndCountryPractice
 */
public class Main {
    public static void main(String[] args) {
        App myApp = new App();

        myApp.addPerson(new Person("Liliana", 23));
        myApp.addPerson(new Person("Livia", 35));
        myApp.addPerson(new Person("Ana", 25));
        myApp.printNameAndAge();

        Hobby cycling = new Hobby("cycling", 8);
        cycling.addAddress(new Address("Happy", "San Francisco", "USA"));
        cycling.addAddress(new Address("Gorgeous", "San Jose", "USA"));
        cycling.addAddress(new Address("Fabulous", "Paris", "France"));

        Hobby swimming = new Hobby("swimming", 5);
        swimming.addAddress(new Address("Happy", "New York", "USA"));
        swimming.addAddress(new Address("Gorgeous", "California", "USA"));
        swimming.addAddress(new Address("Fabulous", "Lyon", "France"));

        Person person1 = new Person("Maria", 33);
        myApp.addPerson(person1);
        myApp.addHobbyToHashMap(person1, swimming);
        myApp.addHobbyToHashMap(person1, cycling);

        myApp.addHobbyToHashMap(new Person("Ema", 31), swimming);

        myApp.printNamesOfHobbiesAndCountryForAPerson(person1);

    }
}



