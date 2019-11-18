import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("What Is The Price Of The Item? ");
		double amnt = kb.nextDouble();

		System.out.println("How much money was tendered by customer? ");
		double tendered = kb.nextDouble();

		int change = (int) ((tendered * 100) - (amnt * 100));
		double changE = ((double) change) / 100;

		int penny = 1;
		int nickel = 5;
		int dime = 10;
		int quarter = 25;
		int dollar = 100;
		int five = 500;
		int ten = 1000;
		kb.close();

		if (tendered < amnt) {
			System.out.println("Error");

		}else if (tendered == amnt) {
			System.out.println("Change due: $0.00. Thank you!  ");
		} else if (tendered > amnt) {
			System.out.println(" change due : " + changE);


		int teN = change % ten;
		if (ten == (change - teN)) {
			System.out.print(" \t$10.00 ");
		}
		int fiVe = teN % five;
		if (teN >= five && teN != ten) {
			System.out.print("\t$5.00 ");
		}
		int dollaR = change % dollar;
		if (five >= dollar) {
			int d = (five - dollar) / 100;
			System.out.print(d + "Dollars\t");
		}
		int quarteR = dollaR % quarter;
		if (dollar >= quarter) {
			int q = dollaR - quarter;
			q = q / quarter;
			System.out.print(q + "quarters\t");
		}
		int dimE = quarteR % dime;
		if (quarter >= dime) {
			int di = quarteR - dimE;
			di = di / dime;
			System.out.print(di + "dimes\t");
		}
		int nickeL = dimE % nickel;
		if (dime >= nickel) {
			int n = dimE - nickel;
			n = n / nickel;
			System.out.print(n + "nickels\t");
		}
		int pennY = nickeL % penny;
		if (nickeL >= penny) {
			int p = nickeL - pennY;
			p = p / penny;
			System.out.print(p + "pennies");
		}

		}
	}

	public static void Error() {
		System.out.println("ERROR; insuffecient amount.");
	}

}
