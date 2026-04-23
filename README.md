The Encapsuslation concept introduced for data privacy.

Banking Management System 


Create a BankAccount class with private fields to ensure that sensitive account information is not directly 
accessible: 
• accountNumber (String): A unique identifier for each account. 
• accountHolderName (String): The name of the account holder. 
• balance (double): The account balance. 
• pin (int): A four-digit PIN required for secure transactions. 
Controlled Access via Getters and Setters 
• Provide getters for accountNumber and accountHolderName (as they should be readable but not 
modifiable). 
• Provide a getter for balance, but restrict access by requiring a valid PIN for verification. 
• Provide setters for balance, ensuring deposits and withdrawals go through controlled methods. 
• Do not provide a setter for accountNumber to maintain immutability. 
Secure Transactions 
• deposit(double amount): Increases the balance but ensures the deposit amount is positive. 
• withdraw(double amount, int pin): 
o Requires the correct PIN for withdrawal. 
o Ensures sufficient funds before deducting the amount. 
• checkBalance(int pin): Returns the account balance only if the correct PIN is provided. 
Data Validation and Security 
• The system should prevent: 
o Setting negative balances. 
o Depositing or withdrawing invalid amounts. 
o Accessing balance or withdrawing money without the correct PIN.



  I utilized the concept for accessing the private data members through methos setters and got the data through getter methods.
  The standard practice of Encapsulation concepts is creating 2 class 
  "1" for data encapsulation.
  "2" for accessing form outside only condition satisfy 's.
