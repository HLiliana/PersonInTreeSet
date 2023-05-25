package org.example;

import java.util.*;

public class App {
    Comparator<Person> comparatorByName = new ComparatorName();
    Comparator<Person> comparatorByAge = new ComparatorAge();

    Comparator<Person> combinedComparator = comparatorByName.thenComparing(comparatorByAge);

    TreeSet<Person> personSet = new TreeSet<>(combinedComparator);
    List<Hobby> hobbyList = new ArrayList<>();
    HashMap<Person, List<Hobby>> personListHashMap = new HashMap<>();

    public void addPerson(Person person) {
        personSet.add(person);
    }

    public void printNameAndAge() {
        System.out.println("Our TreeSet contains: " + "\n");
        for (Person people : personSet) {
            System.out.println(people.getName() + " is " + people.getAge() + " years of age.");
        }
        System.out.println();
    }

    public void addHobbyToHashMap(Person person, Hobby hobby) {
        hobbyList = personListHashMap.getOrDefault(person, new ArrayList<>());
        hobbyList.add(hobby);
        personListHashMap.put(person, hobbyList);
    }

    public void printNamesOfHobbiesAndCountryForAPerson(Person person) {
        List<Hobby> hobbies = personListHashMap.getOrDefault(person, new ArrayList<>());
        System.out.print(person.getName().toUpperCase() + " has this hobbies: " + "\n");
        for (Hobby hobby : hobbies) {
            System.out.println(hobby.getHobbyName().toUpperCase(Locale.ROOT) + " - ");
            for (Address address : hobby.getAddressList()) {
                System.out.print(address.getCountry() + ", ");
            }
            System.out.println();
        }
    }


}
