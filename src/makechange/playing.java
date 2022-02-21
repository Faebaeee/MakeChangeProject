package makechange;

import java.util.Scanner;

public class playing {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the price of the item ");
			double price = sc.nextDouble();

			System.out.println("Please enter amount tendered ");
			double amountTendered = sc.nextDouble();

			double sale = 0;
			double totalChange = (amountTendered - sale);
			System.out.println("Change total is $ " + totalChange);

			if (price > amountTendered) {
				System.out.println("Not enough funds");
				amountTendered = sc.nextDouble();
			}
			totalChange = amountTendered - price;
		}

		String changeTotal = null;
		System.out.println("Total change is" + changeTotal);
	}

	{

		System.out.println("Enter amount");
		double price = 0;
		double amountTendered = (int) (price * 100);

		double TwentyDollarBills = amountTendered / 100;
		price = amountTendered % 100;
		System.out.println("Change is " + TwentyDollarBills + "20 dollar bills");

		double tenDollarBills = amountTendered / 100;
		price = amountTendered % 100;
		System.out.println("Change is 10 dollar bills");

		double fiveDollarBills = amountTendered / 100;
		price = amountTendered % 100;
		System.out.println("Change is 5 dollar bills");

		double oneDollarBills = amountTendered % 100;
		price = amountTendered % 100;
		System.out.println("Change is 1 dollar bills");
	}
	{
		double price = 0;
		double changeTotal = 0;
		double amountTendered = 0;
		double changeCents = (changeTotal + 0.005) - (double) (changeTotal * 100);

		double Quarters = amountTendered / 25;
		amountTendered = amountTendered % 25;
		System.out.println("Change due is " + "Quarters");

		double Dimes = amountTendered / 10;
		amountTendered = amountTendered % 100;
		System.out.println("Change due is " + "dimes");

		double Nickles = amountTendered / 5;
		amountTendered = amountTendered % 5;
		System.out.println("change due is " + "Nickles");

		double Pennies = amountTendered / 1;
		amountTendered = amountTendered % 1;
		System.out.println("Change due is" + "Pennies");

	}

}