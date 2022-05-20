package com.mag;

import java.util.ArrayList;
//import java.util.HashMap;

public class Bank {
    public static ArrayList<Person> personList;
    public static ArrayList<CheckingAccount> accountList;

    public Bank(ArrayList<Person> personList, ArrayList<CheckingAccount> accountList) {
        Bank.personList= personList;
        Bank.accountList=accountList;
    }

    public static void createAccount(Person person, CheckingAccount account){
        personList.add(person);
        accountList.add(account);
    }
}
