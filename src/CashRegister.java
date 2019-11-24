import java.util.Scanner;

public class CashRegister {
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double changeDue;

		System.out.println("What Is The Price Of The Item? ");
		double amnt = kb.nextDouble();

		System.out.println("How much money was tendered by customer? ");
		double tendered = kb.nextDouble();
		kb.close();

		changeDue = (tendered - amnt);
		

		if (tendered < amnt) {
			System.out.println("Price of item:" + amnt);
			System.out.println("Amount customer tendered: " + tendered);
			System.out.println("__________________________");
			System.out.println("ERROR; insufficient amount.");

		} else if (tendered == amnt) {
			System.out.println("Price of item:" + amnt);
			System.out.println("Amount customer tendered: " + tendered);
			System.out.println("____________________________");
			System.out.println("Change due: $0.00. Thank you!  ");

		} else { // (tendered > amnt) {
			System.out.println("Price of item:" + amnt);
			System.out.println("Amount customer tendered: " + tendered);
			System.out.println("_______________________________");
			System.out.println(" change due : $" + changeDue + "0");
			System.out.println();
			System.out.println("Cashier return:  ");

			makeChange(changeDue);

		}
	}

	public static void makeChange(double changeDue) {

		double penny = .01;
		int pennycount = 0;
		double nickel = .05;
		int nickelcount = 0;
		double dime = .10;
		int dimecount = 0;
		double quarter = .25;
		int quartercount = 0;
		int dollar = 1;
		int dollarcount = 0;
		int five = 5;
		int fivecount = 0;
		int ten = 10;
		int tencount = 0;
		int twenty = 20;
		int twentycount = 0;
		int hundred = 100;
		int hundredcount = 0;

		while (changeDue >= hundred) {
			hundredcount++;
			changeDue = changeDue - hundred;
		}
		if (hundredcount == 1) {
			System.out.println(hundredcount + " hundred");
		} else if (twentycount > 1) {
			System.out.println(hundredcount + " hundreds");
		}

		while (changeDue >= twenty) {
			twentycount++;
			changeDue = changeDue - twenty;
		}
		if (twentycount == 1) {
			System.out.println(twentycount + " twenty");
		} else if (twentycount > 1) {
			System.out.println(twentycount + " twentys");
		}

		while (changeDue >= ten) {
			tencount++;
			changeDue = changeDue - ten;
		}
		if (tencount == 1) {
			System.out.println(tencount + " ten");
		} else if (tencount > 1) {
			System.out.println(tencount + " tens");
		}

		while (changeDue >= five) {
			fivecount++;
			changeDue = changeDue - five;
		}
		if (fivecount == 1) {
			System.out.println(fivecount + " five");
		} else if (fivecount > 1) {
			System.out.println(fivecount + " fives");
		}

		while (changeDue >= dollar) {
			dollarcount++;
			changeDue = changeDue - dollar;
		}
		if (dollarcount == 1) {
			System.out.println(dollarcount + " dollar");
		} else if (dollarcount > 1) {
			System.out.println(dollarcount + " dollars");
		}

		while (changeDue >= quarter) {
			quartercount++;
			changeDue = changeDue - quarter;
		}
		if (quartercount == 1) {
			System.out.println(quartercount + " quarter");
		} else if (quartercount > 0) {
			System.out.println(quartercount + " quarters");
		}

		while (changeDue >= dime) {
			dimecount++;
			changeDue = changeDue - dime;
		}
		if (dimecount == 1) {
			System.out.println(dimecount + " dime");
		} else if (dimecount > 0) {
			System.out.println(dimecount + " dimes");
		}

		while (changeDue >= nickel) {
			nickelcount++;
			changeDue = changeDue - nickel;
		}
		if (nickelcount == 1) {
			System.out.println(nickelcount + " nickel");
		} else if (nickelcount > 0) {
			System.out.println(nickelcount + " nickels");
		}

		while (changeDue >= penny) {
			pennycount++;
			changeDue -= penny;
		}
		if (changeDue > .001) {
			pennycount++;
		}
		if (pennycount ==1) {
			System.out.println(pennycount + " Penny");
		}else if (pennycount > 0) {
			System.out.println(pennycount + " pennies");
		}

		
		
		while (changeDue < 0) {
			System.out.println("no change due");
		}
		
		Quit();
		
		  } 
	public static void Quit() { 
		System.out.println("PleaseComeAgain");
		  return;
		 
	}
}
