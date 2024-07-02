package org.cventbootcamp;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        else{
            this.name = name;
        }
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        else{
            this.age = age;
        }
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email cannot be null or empty.  Email must have a @ character.");
        }
        else{
            this.email = email;
        }
    }
}
