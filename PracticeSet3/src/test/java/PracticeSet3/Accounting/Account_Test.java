package PracticeSet3.Accounting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Account_Test {
	

	@Test

	public void TestAccount() {
		Account accountTest = new Account(1122, 22000);
		accountTest.setAnnualInterestRate(4.5);
		
		double dActualInt = accountTest.getBalance();
		double dExpectInt = 22000;
		assertEquals(dActualInt, dExpectInt, .001);
		
		double dActualInt2 = accountTest.getAnnualInterestRate();
		double dExpectInt2 = 4.5;
		assertEquals(dActualInt2, dExpectInt2, .001);
	}

	@Test

	public void Account() throws InsufficientFundsException {
		Account account = new Account();
		account.setId(1122);
		account.setBalance(22000);
		account.setAnnualInterestRate(4.5);

		double dActualInt = account.withdraw(2500);
		double dExpectInt = 19500;
		assertEquals(dActualInt, dExpectInt, .001);

		System.out.print("The balance of the account ID" + " " + account.getId() + " " + "is" + " " + "$"
			+ account.getBalance() + " " + "and the month interest rate is" + " " 
			+ account.getMonthlyInterestRate() + "% " + "and the" + " " + "account was created on" + " " 
			+ account.getDateCreated());
		System.out.println();
	}

	@Test

	public void Account1() throws InsufficientFundsException {
		Account account1 = new Account();
		account1.setId(1122);
		account1.setBalance(22000);
		account1.setAnnualInterestRate(4.5);

		double dActualInt2 = account1.deposit(3000);
		double dExpectInt2 = 25000;
		assertEquals(dActualInt2, dExpectInt2, .001);

		System.out.print("The balance of the account ID" + " " + account1.getId() + " " + "is" + " " + "$"
			+ account1.getBalance() + " " + "and the month interest rate is" + " "
			+ account1.getMonthlyInterestRate() + "% " + "and the" + " " + "account was created on" + " "
			+ account1.getDateCreated());
		System.out.println();
	}

	@Test
	public void Account2() throws InsufficientFundsException {
		Account account2 = new Account();
		account2.setId(1122);
		account2.setBalance(22000);
		account2.setAnnualInterestRate(4.5);

		double dActualInt = account2.withdraw(25000);
		double dExpectInt = 22000;
		assertEquals(dActualInt, dExpectInt, .001);

		System.out.print("The balance of the account ID" + " " + account2.getId() + " " + "is" + " " + "$"
			+ account2.getBalance() + " " + "and the month interest rate is" + " "
			+ account2.getMonthlyInterestRate() + "% " + "and the" + " " + "account was created on" + " "
			+ account2.getDateCreated());
		System.out.println();

	}

}
