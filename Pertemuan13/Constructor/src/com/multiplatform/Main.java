package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account("11111111", 200.0, "John", "john@mail.com", "081211111");


        System.out.println("Customer name : " +bobsAccount.getCustomerName());
        System.out.println("Balance : " +bobsAccount.getBalance());
        System.out.println("Email : " +bobsAccount.getEmailAddress());
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(155.0);
    }
}
