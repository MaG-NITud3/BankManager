package com.mag;



public class Menu {
    public static final String enterAmount="Enter Amount\n";
    public static void menuLaunch(){
        System.out.println("Select Action");
        System.out.println("1. Create Account");
        System.out.println("2. Check Account");
        System.out.println("3. Exit");
    }
    public static void subMenuCheckAccount() {
        System.out.println("1. Print Details");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
    }
}
