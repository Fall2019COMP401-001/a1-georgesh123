package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Number of people in list
		int count = scan.nextInt();
		
		Shopper[] listOfShoppers = new Shopper[count];
		
		for (int i = 0; i < count; i++) {
			listOfShoppers[i].first = scan.next().charAt(0);
			listOfShoppers[i].last = scan.next();
			listOfShoppers[i].numOfItems = scan.nextInt();
			listOfShoppers[i].listOfItems = new Items[listOfShoppers[i].numOfItems];
			for (int j = 0; j < listOfShoppers[i].numOfItems; j++) {
				listOfShoppers[i].listOfItems[j].quant = scan.nextInt();
				listOfShoppers[i].listOfItems[j].nameOfItem = scan.next();
				listOfShoppers[i].listOfItems[j].price = scan.nextDouble();
			}
		}
		double[] pricePerPerson = new double[count];
		
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < listOfShoppers[i].numOfItems; j++) {
				double tot = 0;
				double totPerItem =  listOfShoppers[i].listOfItems[j].quant * listOfShoppers[i].listOfItems[j].price;
				pricePerPerson[i] = pricePerPerson[i] + totPerItem;
			}
		}
		
		double[] averagePerPerson = new double[count];
		for (int i = 0; i < count; i++) {
			averagePerPerson[i] = pricePerPerson[i] / listOfShoppers[i].numOfItems;
		}
		
		for (int i = 0; i < count; i++) {
			System.out.println(listOfShoppers[i].first + ". " + listOfShoppers[i].last + " " + averagePerPerson[i]);
		}
		
	}
	
	/* This creates a class for each shopper.
	 * It includes their first initial and last name, number of items, and a string of items.
	 */
	public class Shopper {
		char first;
		String last;
		int numOfItems;
		Items[] listOfItems;
	}
	/* This creates a class for each item.
	 * It includes the quantity, name, and price of each item.
	 */
	public class Items {
		int quant;
		String nameOfItem;
		double price;
	}
}
