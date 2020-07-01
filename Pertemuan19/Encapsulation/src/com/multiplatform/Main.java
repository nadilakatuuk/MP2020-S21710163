package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	/*Account johnAccount = new Account();
	johnAccount.accountNumber = "1234566";
	johnAccount.name= "John";
	johnAccount.balance=100d;

	johnAccount.withdrawl(50);
        System.out.println("Balance = " + johnAccount.getBalance());*/

        Account johnAccount = new Account("123456789", "John", 100d);

        johnAccount.withdrawl(50);
        System.out.println("Balance = "+ johnAccount.getBalance());

        johnAccount.withdrawl(51);
        System.out.println("Balance = "+ johnAccount.getBalance());
    }

}
