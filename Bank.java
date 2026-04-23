package Bank_Management_System;

public class Bank {
	String  accountNumber;
	String accountHolderName;
	double balance;
	int pin;
	
	void setter(String name,String number,double b,int p)
	{
		accountNumber=number;
		accountHolderName=name;
		balance=b;
		pin=p;
		
		
	}
	String getNum_Name()
	{
		return "Holder_Name: "+accountHolderName+"Account_Number: "+accountNumber;
	}
	
	double getbal(int a)
	{
		if(a!=pin) {
			return -1;
		}else {
			return balance;
		}
		
	}
	void display()
	{
		System.out.println("Account_Holder_Name: "+accountHolderName);
		System.out.println("Account_Number: "+accountNumber);
	}
	void withdraw(double a) {
		if(a<balance && a>0) {
			balance=balance-a;
			System.out.println("Withdrawed successfully..!");
			System.out.println("Balance: "+balance);
		}
	}
}
	
	


