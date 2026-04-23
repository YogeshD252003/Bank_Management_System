package Bank_Management_System;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		b.setter("Yogi","1SB22CS125",50000.00,1234);
		b.display();
		System.out.print("Enter the passaward:");
		int a=sc.nextInt();
		System.out.println("Balance is "+b.getbal(a));
		System.out.println("Withdraw the Money: ");
		double c=sc.nextDouble();
		b.withdraw(c);
		
	}

}
