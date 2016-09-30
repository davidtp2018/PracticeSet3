// Thomas Pennington
package PracticeSet3.Accounting;

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new java.util.Date();
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12.0);
	}

	public double withdraw(double amtwithdraw) throws InsufficientFundsException {

		try {
			if (amtwithdraw <= balance) {
				return balance = balance - amtwithdraw;
			} else {
				double shortAmt = amtwithdraw - balance;
				throw new InsufficientFundsException(shortAmt);
			}
		} catch (InsufficientFundsException anexception) {
			System.out.println("Sorry, You your account has insufficient funds by $" 
				+ anexception.getAmount());
		}

		return balance;

	}

	public double deposit(double depositamt) {
		balance = balance + depositamt;
		return balance;
	}

}
