package lab4.prog4_3;

import java.util.Scanner;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		while(true) {
			Scanner sc = new Scanner(System.in);
			String answer1;
			String answer2;
			String answer3;
			String answer4;
			while (true) {
				System.out.print("\nA. See a report of all accounts.\n" +
						"B. Make a deposit.\n" +
						"C. Make a withdrawal.\n" +
						"Make a selection (A/B/C): ");
				answer1 = sc.next();
				if (answer1.toUpperCase().equals("A") || answer1.toUpperCase().equals("B") || answer1.toUpperCase().equals("C"))
					break;
				else
					System.out.println("!!! Invalid input. Try again !!!");
			}

			if (!answer1.toUpperCase().equals("A")) {
				while (true) {
					System.out.println(getName());
					System.out.print("Select an account: (type a number): ");
					answer2 = sc.next();

					try {
						int i = Integer.parseInt(answer2);
						if (i >= 0 && i < emps.length)
							break;
						else
							System.out.println("!!! Invalid input. Try again !!!");
					} catch (Exception e) {
						System.out.println("!!! Invalid input. Try again !!!");
					}
				}

				while (true) {
					System.out.print("\n0. checking\n" +
							"1. savings\n" +
							"2. retirement\n" +
							"Select an account: (type a number): ");
					answer3 = sc.next();

					try {
						int i = Integer.parseInt(answer3);
						if (i >= 0 && i <= 2)
							break;
						else
							System.out.println("!!! Invalid input. Try again !!!");
					} catch (Exception e) {
						System.out.println("!!! Invalid input. Try again !!!");
					}
				}


				while (true) {
					System.out.print("Amount (type a number > 0): ");
					answer4 = sc.next();

					try {
						int i = Integer.parseInt(answer4);
						if (i > 0)
							break;
						else
							System.out.println("!!! Invalid input. Try again !!!");
					} catch (Exception e) {
						System.out.println("!!! Invalid input. Try again !!!");
					}
				}

				if (answer1.toUpperCase().equals("B")) {
					emps[Integer.parseInt(answer2)].deposit(Integer.parseInt(answer3),Integer.parseInt(answer4) );
					System.out.println("$" + answer4 + " has been deposited in the " + emps[Integer.parseInt(answer2)].getAccount(Integer.parseInt(answer3)).getAccountTypeString() + " account of " + emps[Integer.parseInt(answer2)].getName());
					System.out.println("Balance : $" + emps[Integer.parseInt(answer2)].getAccount(Integer.parseInt(answer3)).getBalanceCheck());
				}

				if (answer1.toUpperCase().equals("C")) {
					if (emps[Integer.parseInt(answer2)].withdraw(Integer.parseInt(answer3), Integer.parseInt(answer4))){
						System.out.println("$" + answer4 + " has been withdrawn in the " + emps[Integer.parseInt(answer2)].getAccount(Integer.parseInt(answer3)).getAccountTypeString() + " account of " + emps[Integer.parseInt(answer2)].getName());
						System.out.println("Balance : $" + emps[Integer.parseInt(answer2)].getAccount(Integer.parseInt(answer3)).getBalanceCheck());
					}
					else
						System.out.println("!!! Insufficient funds !!!");
				}


			} else {
				System.out.println(getFormattedAccountInfo());
			}

			String exit = "";
			while (true) {
				System.out.print("Do you want to exit? (y/n): ");
				exit = sc.next();

				try {
					if (exit.equalsIgnoreCase("y") || exit.equalsIgnoreCase("n"))
						break;
				} catch (Exception e) {
				}
			}
			if(exit.equalsIgnoreCase("y"))
				break;
		}
	}

	String getName(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<emps.length; i++){
			sb.append("\n").append(i+".").append(emps[i].getName());
		}
		return sb.toString();
	}

	String getFormattedAccountInfo(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<emps.length; i++){
			sb.append(emps[i].getFormattedAcctInfo()).append("\n");
		}
		return sb.toString();
	}
}

