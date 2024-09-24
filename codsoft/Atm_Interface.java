import java.util.Scanner;

class Atminterface {

  private double balance;
  
  public Atminterface(double initialbalance) {
   this.balance =initialbalance;
}
public double getbalance() {
return balance;
}
public void deposit (double amount) {
if(amount > 0) {
balance += amount;
System.out.println("deposit of $ "+ amount + "successful. current balance: $" +balance);
}
else {
System.out.println("Invalid deposit amount. ");
}
}

public void withdraw(double amount) {
 if(amount > 0 && amount <= balance) {
balance -=amount;
System.out.println("withdraw of $" + amount + "successful.current balance: $" + balance);
}
else {
 System.out.println("Invalid withdraw  amount or insufficient balance. ");
}
}
}

class ATM {
private Atminterface bankAccount;

 public ATM(Atminterface bankAccount) {
  this.bankAccount = bankAccount;
}
public void displayMenu() {
System.out.println("ATM Menu");
System.out.println("1.check Balance");
System.out.println("2.Deposit");
System.out.println("3.withdraw");
System.out.println("4.Exit");
}
public void PerformTransaction(int choice,Scanner scanner) {
 switch(choice) {
case 1:
 System.out.println("current balance : $" + bankAccount.getbalance());
break;
case 2:
System.out.println("Enter Deposit amount: $");
double depositAmount = scanner.nextDouble();
bankAccount.deposit(depositAmount);
break;
case 3:
System.out.println("Enter withdrawl amount: $");
double withDrawlAmount = scanner.nextDouble();
bankAccount.withdraw(withDrawlAmount);
break;
case 4:
System.out.println("Exiting ATM . Thank You!");
scanner.close();
System.exit(0);
default:
System.out.println("invalid choice,please select a valid option.");
}
}
}
class ATM_Interface {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter initial account balance: $");
double initialbalance = scanner.nextDouble();
Atminterface bankAccount = new Atminterface(initialbalance);
 
ATM atm = new ATM(bankAccount);

while(true) {
 atm.displayMenu();
System.out.print("select an option: ");
int choice =scanner.nextInt();

atm.PerformTransaction(choice, scanner);
}
}
}




















