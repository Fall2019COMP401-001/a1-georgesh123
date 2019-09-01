package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemsInStore = scan.nextInt();
		String[] listOfItems = new String[itemsInStore];
		double[] listOfPrices = new double[itemsInStore];
		for (int i = 0; i < itemsInStore; i++) {
			listOfItems[i] = scan.next();
			listOfPrices[i] = scan.nextDouble();
		}
		
		int count = scan.nextInt();
		
		String[] first = new String[count];
		String[] last = new String[count];
		int[] numOfItems = new int[count];
		double[] pricePerPerson = new double[count];
		for (int i = 0; i < count; i++) {
			first[i] = scan.next();
			last[i] = scan.next();
			numOfItems[i] = scan.nextInt();
			for (int j = 0; j < numOfItems[i]; j++) {
				int numPerItem = scan.nextInt();
				String name = scan.next();
				double price = 0;
				for (int k = 0; k < itemsInStore; k++) {
					if (name.equals(listOfItems[k])) {
						price = listOfPrices[k];
					}
				}
				price = price * numPerItem;
				pricePerPerson[i] = pricePerPerson[i] + price;
			}
		}
		
		scan.close();
		int biggest = 0;
		for (int i = 0; i < count; i++) {
			if (pricePerPerson[i] > pricePerPerson[biggest]) {
				biggest = i;
			}
		}
		String biggestTot = String.format("%.2f", pricePerPerson[biggest]);
		
		int smallest = 0;
		for (int i = 0; i < count; i++) {
			if (pricePerPerson[i] <pricePerPerson[smallest]) {
				smallest = i;
			}
		}
		String smallestTot = String.format("%.2f", pricePerPerson[smallest]);
		
		double totPrice = 0;
		for (int i = 0; i < count; i++) {
			totPrice += pricePerPerson[i];
		}
		double average = totPrice / count;
		String averagePrice = String.format("%.2f", average);
		
		System.out.println("Biggest: " + first[biggest] + " " + last[biggest] + " (" + biggestTot + ")");
		System.out.println("Smallest: " + first[smallest] + " " + last[smallest] + " (" + smallestTot + ")");
		System.out.println("Average: " + averagePrice);
		
	}
}
