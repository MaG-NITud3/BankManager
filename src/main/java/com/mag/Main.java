package com.mag;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int var;
        Scanner input = new Scanner(System.in);
        int ssn = 9999999;
        int acc_number = 1;
        Person bolan = new Person("matthew","","bolan", 25, ssn);
        CheckingAccount bolan1 = new CheckingAccount(10000d);
        Bank.createAccount(bolan, bolan1, acc_number);
        Bank.getDetails(acc_number);
        bolan1.deposit(1000);
        Bank.getDetails(acc_number);
    }
}
