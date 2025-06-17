package main;

import bank.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Person alice = new Person("Alice");
        Person bob = new Person("Bob");

        bank.registerCustomer(bob, 0);
        bank.registerCustomer(alice, 100);

        boolean transfer = bank.transfer(alice, bob, 20);
        System.out.println("Transfer before Alice is registered: " + transfer);

        System.out.println("Alice balance: " + bank.getBalance(alice));
        System.out.println("Bob balance: " + bank.getBalance(bob));
    }
}
