package PracticeSet3.Accounting;

import java.io.*;

public class InsufficientFundsException extends Exception {

	private double amountShort;

	public InsufficientFundsException(double amountShort) {
		this.amountShort = amountShort;
	}

	public double getShortAmount() {
		return amountShort;
	}

}
