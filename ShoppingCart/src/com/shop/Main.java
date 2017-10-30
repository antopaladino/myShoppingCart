package com.shop;


import java.text.DecimalFormat;

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
		
		if (args.length > 0){
			for (int i=0; i<args.length; i++){
				String fruitName = args[i].toLowerCase();
				switch (fruitName) {
				case Fruit.APPLE_NAME:
					basket.addFruit(new Apple());
					System.out.println(String.format("'%s' added to basket", fruitName));
					break;
				case Fruit.ORANGE_NAME:
					basket.addFruit(new Orange());
					System.out.println(String.format("'%s' added to basket", fruitName));
					break;
				default:
					System.out.println(String.format("'%s' product not valid. System accepts only: apple and orange", fruitName));
					break;
				}				
			}
			System.out.println("List of products in the basket: " + basket.getFruitNameList());
		} else {
			// Use a predefined list of products
			basket.addFruit(new Apple());
			basket.addFruit(new Apple());
			basket.addFruit(new Orange());
			
			
			System.out.println("Pre-defined list of products loaded into the basket: " + basket.getFruitNameList());
			
		}
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
		double total = basket.checkout();
		System.out.println(String.format("£ %s Total cost", df.format(total)));
		
	}

	
}