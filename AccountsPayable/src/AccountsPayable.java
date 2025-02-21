/*
 * This is a class that Creates and 
 */
import java.util.Scanner;

public class AccountsPayable {

	public static void main(String[] args) {
		Employee[] payableEmployees = new Employee[6];
		Scanner input = new Scanner(System.in);
		int type;

		for (int i = 0; i < 6; i++) {
			System.out.println(
					"What type of emplyee is it, 1:Empolyee, 2: Hourly, 3:Salaried , 4:Commision, 5:BaseplusCommision");
			type = input.nextInt();
			input.nextLine();
			switch (type) {
			case 1:
				System.out.println("You Chose base emplyee,");
				System.out.println("What is their first name?");
				String name1;
				name1 = input.nextLine();
				String name2;
				System.out.println("What is their last name?");
				name2 = input.nextLine();
				System.out.println("What is their SSN?");
				int ssn1 = input.nextInt();
				payableEmployees[i] = new Employee(name1, name2, ssn1);
				break;
			case 2:
				System.out.println("You Chose Hourly");
				System.out.println("What is their first name?");
				String name11;
				name11 = input.nextLine();
				String name21;
				System.out.println("What is their last name?");
				name21 = input.nextLine();
				System.out.println("What is their SSN?");
				int ssn11 = input.nextInt();
				System.out.println("What is their Hourly Wage?");
				double hourWage = input.nextDouble();
				System.out.println("How many hours?");
				double amountHour = input.nextDouble();
				payableEmployees[i] = new HourlyEmployee(name11, name21, ssn11, hourWage, hourWage);
				break;
			case 3:
				System.out.println("You chose Salary");
				System.out.println("What is their first name?");
				String name111;
				name111 = input.nextLine();
				String name211;
				System.out.println("What is their last name?");
				name211 = input.nextLine();
				System.out.println("What is their SSN?");
				int ssn111 = input.nextInt();
				System.out.println("What is the weekly salary");
				double weekSal = input.nextDouble();
				payableEmployees[i] = new SalariedEmployee(name111, name211, ssn111, weekSal);
				break;
			case 4:
				System.out.println("You Chose commission ,");
				System.out.println("What is their first name?");
				String comName1;
				comName1 = input.nextLine();
				String comName2;
				System.out.println("What is their last name?");
				comName2 = input.nextLine();
				System.out.println("What is their SSN?");
				int comSsn = input.nextInt();
				System.out.println("What is their gross sales?");
				double grossSale = input.nextDouble();
				System.out.println("What is their commmison rate?");
				double commRate = input.nextDouble();
				payableEmployees[i] = new CommissionEmployee(comName2, comName2, comSsn, grossSale, commRate);
				break;
			case 5:
				System.out.println("You Chose Comm + base emp");
				System.out.println("What is their first name?");
				String comand1;
				comand1 = input.nextLine();
				String comand2;
				System.out.println("What is their last name?");
				comand2 = input.nextLine();
				System.out.println("What is their SSN?");
				int comSSn = input.nextInt();
				System.out.println("What is their gross Sales?");
				double comgros = input.nextDouble();
				System.out.println("What is their commision rate?");
				double comrate = input.nextDouble();
				System.out.println("What is their base pay??");
				double basePat = input.nextDouble();
				payableEmployees[i] = new BasePlusCommissionEmployee(comand1, comand2, comSSn, comgros, comrate,
						basePat);
				break;

			}

		}
		for (int i = 0; i < 6; i++) {
			printJustNameAndPayment(payableEmployees[i]);
			increaseBasePlusBy10((payableEmployees[i]));
			printJustNameAndPayment(payableEmployees[i]);
		}

	}

	public static void printDetailsToString(Employee emp) {
		System.out.println(emp.toString());
	}

	public static void printDetailsWithoutToString(Employee emp) {
		if (emp instanceof Employee) {
			System.out.println(
					emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSsn() + " " + emp.getPaymentAmount());
		} else if (emp instanceof HourlyEmployee) {
			System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSsn()
					+ ((HourlyEmployee) emp).getHourlyWage() + " " + ((HourlyEmployee) emp).getHours() + " "
					+ emp.getPaymentAmount());
		} else if (emp instanceof SalariedEmployee) {
			System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSsn() + " "
					+ ((SalariedEmployee) emp).getWeeklySalary() + " " + emp.getPaymentAmount());
		} else if (emp instanceof CommissionEmployee) {
			System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSsn() + " "
					+ ((CommissionEmployee) emp).getGrossSales() + " " + ((CommissionEmployee) emp).getCommissionRate()
					+ " " + emp.getPaymentAmount());
		} else if (emp instanceof BasePlusCommissionEmployee) {
			System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSsn() + " "
					+ ((BasePlusCommissionEmployee) emp).getGrossSales() + " "
					+ ((BasePlusCommissionEmployee) emp).getCommissionRate() + " "
					+ ((BasePlusCommissionEmployee) emp).getBasePay() + " " + emp.getPaymentAmount());
		}
	}

	public static void printJustNameAndPayment(Employee emp) {
		System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getPaymentAmount());
	}

	public static void increaseBasePlusBy10(Employee emp) {
		if (emp instanceof BasePlusCommissionEmployee) {

			((BasePlusCommissionEmployee) emp).setBasePay(((BasePlusCommissionEmployee) emp).getBasePay() * 1.1);
		}
	}

}
