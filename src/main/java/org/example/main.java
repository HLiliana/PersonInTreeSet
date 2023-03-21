package org.example;

import java.util.*;
import  java.util.HashMap;
import java.util.List;
import java.util.Comparator;
import java.util.TreeSet;


/**Requirements:


 for a certain Person, print the names of the hobbies and the countries where it can be practiced


 NOTES

 if you are using a Comparator, the class Person should not implement Comparable anymore

 equals() from Person must be overridden

 */
public class main {
    public static void main(String[] args) {

/** 2 Comparators that will be used when creating the TreeSet
 *iterate through the TreeSet and print the name and the age  */

        TreeSet<Person> personTreeSet = new TreeSet<>(new FirstComparator());
        personTreeSet.add(new Person("Liliana", 33));
        personTreeSet.add(new Person("Marius", 31));
        TreeSet<Person> personTreeSet1 = new TreeSet<>(new SecondComparator());
        personTreeSet.add(new Person("Elena", 38));
        personTreeSet.add(new Person("Liviu", 34));
        for (Person person : personTreeSet) {
            System.out.println(person);
         for (Person person1 : personTreeSet1){
             System.out.println(person1);
         }


          /**  add some information to this map - any detail you consider relevant
            you will use a HashMap with the following structure <Person, List<Hobby>>*/
        Person p6 = new Person("Evelina", 21);
        HashMap<String, List<String>> hashMap =new HashMap<>();

        hashMap.put(String.valueOf(p6), Arrays.asList("dancing", "boxing"));

//            HashMap<Person, List<Hobby>> hashMap =new HashMap<>()
//            hashMap.put("Silvia", Arrays.asList("dancing", "boxing"));
     //        initial asa am pus, deoarece asa am inteles cerinta, dar nu mi-a mers.

        }
    }


     /** define 2 Comparators (one for name and one for age)
     */

    class FirstComparator implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            return (person1.name).compareTo(person2.name);
        }

    }


   public static class SecondComparator implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            return (person1.age).compareTo(person2.age);
            //nu inteleg de ce la age nu ma lasa sa fac cu compareTo???
        }
    }
}

// you need to store Person in a TreeSet
        // add Person to the TreeSet

//        TreeSet<String> Person = new TreeSet<String>();
//        Person.add("Liliana");
//        Person.add("Marius");
//        Person.add("Elena");
//        Person.add("Liviu");
        //for (String value: Person){
        //    System.out.println(value);
        // }
        // cu acest for verificam daca persoanele s-au adaugat corect in TreeSet



