import java.util.Scanner;

public class CashRegister {
	static int makeChange;
	int changeDue;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("What Is The Price Of The Item? ");
		double amnt = kb.nextDouble();

		System.out.println("How much money was tendered by customer? ");
		double tendered = kb.nextDouble();
		kb.close();

		int changeDue = (int) (((tendered * 100) - (amnt * 100))+0.001);
		double changE = ((double) changeDue) / 100;

		if (tendered < amnt) {
			System.out.println("ERROR; insufficient amount.");

		} else if (tendered == amnt) {
			System.out.println("Change due: $0.00. Thank you!  ");

		}
		if (tendered > amnt) {
			System.out.println(" change due : $" + changE + "0");

			makeChange(changeDue);
			
		}
	}

	public static int makeChange(int changeDue) {

		int penny = 1;
		int pennycount = 0;
		int nickel = 5;
		int nickelcount = 0;
		int dime = 10;
		int dimecount = 0;
		int quarter = 25;
		int quartercount = 0;
		int dollar = 100;
		int dollarcount = 0;
		int five = 500;
		int fivecount = 0;
		int ten = 1000;
		int tencount = 0;

		
		if (ten < changeDue) {
			tencount++;
			changeDue = changeDue - ten;
			System.out.println(tencount + "ten dollar bills");
			
		}
		if (five < changeDue) {
			fivecount++;
			changeDue = changeDue - five;
			System.out.println(fivecount + " Five Dollar Bills");
		}
		if (dollar < changeDue) {
			dollarcount++;
			changeDue = changeDue - dollar;
			System.out.println(dollarcount + " One Dollar Bills");
		}
		if (quarter < changeDue) {
			quartercount++;
			changeDue = changeDue - quarter;
			System.out.println(quartercount + " quarters");
		}
		if (dime < changeDue) {
			dimecount++;
			changeDue = changeDue - dime;
			System.out.println(dimecount + " dime(s)");
		}
		if (nickel < changeDue) {
			nickelcount++;
			changeDue = changeDue - nickel;
			System.out.println(nickelcount + " nickels");
		}
		if (penny <= (changeDue)) {
			pennycount++;
			changeDue = changeDue - penny;
			System.out.println(pennycount + " pennies ");
		} else if (makeChange < 0) {
			System.out.println("no change due");
		}
		return makeChange;

	}
}

