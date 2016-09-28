package PracticeSet3.Accounting;

public class Account_Test {
	
	public static void main(String[] args){
		Account account1 = new Account();
		account1.setId(1122);
		account1.setBalance(22000);
		account1.setAnnualInterestRate(4.5);
		
		account1.deposit(10000);
		account1.withdraw(35000);
		
		System.out.print("The the balance of the account is " + "$" + account1.getBalance() + " " 
				+ "and the month interest rate is" + " " + +account1.getMonthlyInterestRate() +" " + 
				"and the" + " " + "account was created on" + " " + account1.getDateCreated());
	}
	
	
}
