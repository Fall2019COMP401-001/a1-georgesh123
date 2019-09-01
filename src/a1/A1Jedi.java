package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

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
		int[] numBoughtPerItem = new int[itemsInStore];
		int[] numOfCustomersPerItem = new int[itemsInStore];
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
						numBoughtPerItem[k] += numPerItem;
						numOfCustomersPerItem[k] +=1;
					}
				}
				price = price * numPerItem;
				pricePerPerson[i] = pricePerPerson[i] + price;
			}
		}
		
		
		scan.close();
		for (int i = 0; i < itemsInStore; i++) {
			if(numOfCustomersPerItem[i] == 0) {
				System.out.println("No customers bought " + listOfItems[i]);
			} else {
				System.out.println(numOfCustomersPerItem[i] + " customers bought " + numBoughtPerItem[i] + " " + listOfItems[i]);
			}
		}
	}
}
