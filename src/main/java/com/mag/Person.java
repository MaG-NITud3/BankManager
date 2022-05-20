package com.mag;

public class Person {
    public String firstname;
    public String middlename;
    public String lastname;
    public int age;
    private int ssn;

    public Person(String firstname, String middlename, String lastname, int age, int ssn) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.age = age;
        this.ssn = ssn;
    }
    public int getSsn(){
        return this.ssn;
    }
}
