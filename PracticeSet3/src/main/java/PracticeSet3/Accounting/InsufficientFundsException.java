package PracticeSet3.Accounting;

import java.io.*;

public class InsufficientFundsException extends Exception {

	private double amountShort;

	public InsufficientFundsException(double amountShort) {
		this.amountShort = amountShort;
		System.out.printf("Sorry, You your account has insufficient funds by $%.2f",  amountShort);
	}
	
	public double getAmountShort(){
		return amountShort;
	}
}
