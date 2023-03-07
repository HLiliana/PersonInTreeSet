package org.example;

import org.w3c.dom.ls.LSOutput;

public class Person {

    /**
     * Person are doua atribute : nume si varsta
     */
    public String name;
    public int age;

    /**
     * constructor cu parametri
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person p1= new Person("Liliana", 33);
    Person p2= new Person("Marius", 31);
    Person p3= new Person("Elena", 38);
    Person p4= new Person("Liviu", 34);


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

}
