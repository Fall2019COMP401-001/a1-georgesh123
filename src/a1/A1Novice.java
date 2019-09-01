package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Number of people in list
		int count = scan.nextInt();
		
		String[] first = new String[count];
		String[] last = new String[count];
		int[] numOfItems = new int[count];
		double[] priceOfItems = new double[count];
		double[] totPrices = new double[count];
		for (int i = 0; i < count; i++) {
			first[i] = scan.next();
			last[i] = scan.next();
			numOfItems[i] = scan.nextInt();
			for (int j = 0; j < numOfItems[i]; j++) {
				int numPerItem = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble() * numPerItem;
				totPrices[i] = totPrices[i] + price;
			}
		}
		scan.close();
		for (int i = 0; i < count; i++) {
			System.out.println(first[i].charAt(0) + ". " + last[i] + ": " + totPrices[i]);
		}
	}
}