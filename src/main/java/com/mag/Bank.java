package com.mag;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashMap;

public class Bank {
    public static ArrayList<Person> personList;
    public static ArrayList<CheckingAccount> accountList;
    public static HashMap<Integer, Integer> mapper = new HashMap();
    private static int num=0;


    public Bank(ArrayList<Person> personList, ArrayList<CheckingAccount> accountList) {
        Bank.personList= personList;
        Bank.accountList=accountList;
    }

    public static void createAccount(Person person, CheckingAccount account, int ssn){
        personList.add(person);
        accountList.add(account);
        mapper.put(ssn,num);
        num++;
    }
    public static void getDetails(int ssn){
        //HashMap<Integer, Person> mapper = new HashMap<Integer, Person>();
        personList.get(mapper.get(ssn));
    }
}
