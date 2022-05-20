package com.mag;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int var;
        Scanner input = new Scanner(System.in);
        int ssn = 9999999;
        Person bolan = new Person("matthew","","bolan", 25, ssn);
        CheckingAccount bolan1 = new CheckingAccount(100d);
        Bank.createAccount(bolan, bolan1, ssn);

    }
}
