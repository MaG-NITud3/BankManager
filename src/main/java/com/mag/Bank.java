package com.mag;

import java.util.ArrayList;


public class Bank {
    public static ArrayList<Person> personList = new ArrayList<Person>();
    public static ArrayList<CheckingAccount> accountList = new ArrayList<CheckingAccount>();
    //public static HashMap<Integer, Integer> mapper = new HashMap();
    //private static int num=0;


    /*
    public Bank(ArrayList<Person> personList, ArrayList<CheckingAccount> accountList) {
        Bank.personList= personList;
        Bank.accountList=accountList;
    }
    */

    public static void createAccount(Person person, CheckingAccount account, int ssn){
        personList.add(person);
        accountList.add(account);
        System.out.println("Your account number is "+(personList.size()));

        //mapper.put(ssn,num);
        //num++;

    }
    public static void getDetails(int num){
        //HashMap<Integer, Person> mapper = new HashMap<Integer, Person>();
        System.out.println("Name: "+personList.get(num-1).firstname+" "+personList.get(num-1).middlename+" "+personList.get(num-1).lastname);
        System.out.println("Age: "+personList.get(num-1).age);
        System.out.println("Balance: "+accountList.get(num-1).balance);
        System.out.println("Account Number: "+num);
    }
}
