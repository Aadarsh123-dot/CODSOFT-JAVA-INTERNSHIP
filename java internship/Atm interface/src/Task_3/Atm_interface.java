package Task_3;
import java.util.Scanner;

	class BankAccount{
		double balance;

		BankAccount(double initBalanace){
			balance=initBalanace;
		}

		double getBalance(){
			return balance;
		}

		void deposit(double amount){
			balance += amount;
			System.out.println("Deposit Successfull. New Balance: "+balance);
		}

		void withdraw(double amount){
			if(balance>=amount){
				balance-=amount;
				System.out.println("Withdrawal Successfull. New balance: "+balance);
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
	}

	class ATM{
		BankAccount account;
		Scanner sc=new Scanner(System.in);

		ATM(BankAccount account){
			this.account=account;
		}
		void run(){

			while(true){
				System.out.println("Welcome to the ATM.....");
				System.out.println("1 - Check Balance");
				System.out.println("2 - Withdraw");
				System.out.println("3 - Deposit");
				System.out.println("4 - Exit");

				System.out.print("Enter your Choice: ");
				int choice = sc.nextInt();

				switch (choice){
					case 1:
						checkBalance();
						break;
					case 2:
						withdraw();
						break;
					case 3:
						deposit();
						break;
					case 4:
						System.out.println("Thank You and Visit Again");
						return;
					default:
						System.out.println("Invalid input...Please try again...");

				}
			}
		}
		void checkBalance(){
			System.out.println("Your Balance is: "+account.getBalance());
		}

		void withdraw(){
			System.out.print("Enter amount to withdraw: ");
			double amount=sc.nextDouble();
			account.withdraw(amount);
		}

		void deposit(){
			System.out.print("Enter amount to deposit: ");
			double amount=sc.nextDouble();
			account.deposit(amount);
		}
	}



	public class Atm_interface {
		public static void main(String[] args) {
			BankAccount acc=new BankAccount(1000.00);
			ATM amt= new ATM(acc);
			amt.run();
		}
	}

