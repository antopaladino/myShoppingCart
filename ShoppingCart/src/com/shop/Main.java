package com.shop;


import java.util.Scanner;

/**
 * The class add products to the shopping basket and does a checkout at the end.
 * The class allows passing in a list of String values as fruit name ex. orange, banana.
 * If no arguments are provided than the class will load a predefined list of fruit.
 * 
 * @author Antonio Paladino
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		Basket basket = new Basket();
		String input = null;
		
		// create a scanner so we can read the command-line input
		Scanner in = new Scanner(System.in);
		System.out.println("ShoppingCart application");
		System.out.println("Add fruit to the basket. Type 'exit' if you want exit.");
	    do {
	    	//  prompt for the fruit name
		    System.out.print("Fruit name: ");
		    // get their input as a String
		    input = in.next();
		    
		    // Add fruit to basket
			switch (input.toLowerCase()) {
			case Fruit.APPLE_NAME:
				basket.addFruit(new Apple());
				break;
			case Fruit.ORANGE_NAME:
				basket.addFruit(new Orange());
				break;
			case Fruit.BANANA_NAME:
				basket.addFruit(new Banana());
				break;
			case Fruit.MELON_NAME:
				basket.addFruit(new Melon());
				break;
			default:
				System.out.println(String.format("'%s' is not valid", input));
				break;
			}				
			
			// Print shopping list
			if (basket.getFruitList().size() == 0){
				System.out.println("Basket is empty");
			} else {
				System.out.println("List of products in the basket: " + basket.getFruitNameList());	
			}
			
			// Apply offers and calculate total
			basket.checkout();
			
	    } while (!input.equals("exit"));
		
	}

	
}