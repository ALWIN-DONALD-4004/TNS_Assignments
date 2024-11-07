package com.tns.AssignmentFour;

public class CheckingAccount extends Account{
	

	    public CheckingAccount(float balance) {
	        super(balance);
	    }

	    @Override
	    public void deposit(float amount) {
	        balance += amount;
	    }

	    @Override
	    public void withdraw(float amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Overdraft limit exceeded!");
	        }
	    }

	    @Override
	    public float getBalance() {
	        return balance;
	    }
	}

