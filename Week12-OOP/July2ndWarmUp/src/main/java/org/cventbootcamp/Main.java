package org.cventbootcamp;

public class Main {
    public static void main(String[] args) {
        Person personOne = new Person("John Smith",  34, "john.smith@gmail.com");

        personOne.setName(null);
        personOne.setAge(-34);
        personOne.setEmail(null);

    }
}