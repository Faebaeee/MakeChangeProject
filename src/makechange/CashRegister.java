package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = 0.0, moneyGiven = 0.0, changeCents = 0.0, changeTotal = 0.0;
				int changeBills = 0;
		
		
		
		do{
		
		System.out.println("Please tell me how much your item cost?" );
		price = sc.nextDouble();
		
		System.out.println("how much do you have? ");
		moneyGiven = sc.nextDouble();
		
		
		
		if(price > moneyGiven) {
			System.out.println("Sorry... that's not enough.");
		    moneyGiven = sc.nextDouble();
		}
	 
		if(price == moneyGiven) {
			System.out.println("Thank you! Have a great day!");
			
		}
		changeTotal = moneyGiven - price;
		System.out.println("Your change is " + changeTotal );
		changeBills = (int) changeTotal;
		  
		int count = 0;
		
		count = changeBills / 20;
		if (count > 0) {
		System.out.println("Your change is " + count + " $20 Dollar bills");
		changeBills %= 20;
		}
		
		count = changeBills / 10;
		if (count > 0) {
		System.out.println("Your change is " + count + " $10 Dollar bills");
		changeBills %= 10;
		}
		
		count = changeBills / 5;
		if (count > 0) {
		System.out.println("Your change is " + count + " $5 Dollar bills");
		changeBills %= 5;
		}
		
		count = changeBills / 1;
		if (count > 0) {
		System.out.println("Your change is " + count + " $1 Dollar bills");
		changeBills %= 1;
		}
		
		
		
		
		
		changeCents = (changeTotal + 0.005) - (int)changeTotal;
		changeCents *= 100;
		
		count = (int)changeCents / 25;
		if (count > 0) {
		System.out.println("Your change is " + count + " Ouarters");
		changeCents %= 25;
		}
		
		count = (int)changeCents / 10;
		if (count > 0) {
		System.out.println("Your change is " + count + " Dimes");
		changeCents %= 10;
		}
		
		count = (int)changeCents / 5;
		if (count > 0) {
		System.out.println("Your change is " + count + " Nickels");
		changeCents %= 5;
		}
		
		count = (int)changeCents / 1;
		if (count > 0) {
		System.out.println("Your change is " + count + " Pennies");
		changeCents %= 1;
		}
		
		}
		
		while(true);
	}
	
}
		
		
		
	
		
	
			
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
