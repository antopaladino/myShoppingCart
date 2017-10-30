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
					break;
				case Fruit.ORANGE_NAME:
					basket.addFruit(new Orange());
					break;
				case Fruit.BANANA_NAME:
					basket.addFruit(new Banana());
					break;
				default:
					System.out.println(String.format("'%s' is not valid", fruitName));
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
		double discountGetOneFree = Offer.getOfferBuyOneGetOneFree(basket.getFruitNameList(), new Apple() );
		discountGetOneFree += Offer.getOfferBuyOneGetOneFree(basket.getFruitNameList(), new Banana() );
		double discountThreeForTwo = Offer.getOfferThreeForTwo(basket.getFruitNameList(), new Orange() );
		double discountCheapestForFree = Offer.cheapestFruitForFree(basket.getFruitList());
		double total = basket.checkout() - discountGetOneFree - discountThreeForTwo - discountCheapestForFree;
		
		
		System.out.println(String.format("£ %s Total cost", df.format(total)));
		if (discountGetOneFree > 0)
			System.out.println(String.format("£ %s Promotional Saving *** Buy One Get One Free ***", df.format(discountGetOneFree)));
		if (discountThreeForTwo > 0)
			System.out.println(String.format("£ %s Promotional Saving *** 3 for the price of 2 ***", df.format(discountThreeForTwo)));
		if (discountCheapestForFree > 0)
			System.out.println(String.format("£ %s Promotional Saving *** Cheapest for free ***", df.format(discountCheapestForFree)));
		
	}

	
}