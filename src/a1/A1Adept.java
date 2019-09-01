package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
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
		int biggest = 0;
		for (int i = 0; i < count; i++) {
			if (totPrices[i] > totPrices[biggest]) {
				biggest = i;
			}
		}
		int smallest = 0;
		for (int i = 0; i < count; i++) {
			if (totPrices[i] < totPrices[smallest]) {
				smallest = i;
			}
		}
		double totPrice = 0;
		for (int i = 0; i < count; i++) {
			totPrice = totPrice + totPrices[i];
		}
		double average = totPrice / count;
		String averagePrice = String.format("%.2f", average);
		
		System.out.println("Biggest: " + first[biggest] + " " + last[biggest] + " (" + totPrices[biggest] + ")");
		System.out.println("Smallest: " + first[smallest] + " " + last[smallest] + " (" + totPrices[smallest] + ")");
		System.out.println("Average: " + averagePrice);
	}
}
