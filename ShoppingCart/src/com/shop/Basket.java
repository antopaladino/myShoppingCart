package com.shop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * This class defines the basket used by the shoppers and the functions to interact with it
 * 
 * @author Antonio Paladino
 *
 */
public class Basket {
	private List<Fruit> fruitList = new ArrayList<>();

	List<Fruit> getFruitList() {
		return fruitList;
	}

	void setFruitList(List<Fruit> fruitList) {
		this.fruitList = fruitList;
	}
		
	/**
	 * Add fruit object to the ArrayLsit
	 * @param item the fruit object
	 */
	void addFruit(Fruit item){
		fruitList.add(item);
	}
	
	/**
	 * Returns the fruit names in a List
	 * @return the fruit names in a List
	 */
	List<String> getFruitNameList() {	
		List<String> fruitNameList = new ArrayList<>();
		for(Fruit fruit : fruitList){
			fruitNameList.add(fruit.getName());
		}
		return fruitNameList;
	}
	
	/**
	 * Returns the total cost of the basket
	 * 
	 * @return	the total cost of the basket
	 */
	double checkout() {
		double total = 0;
		for (Fruit item : fruitList){
			total += item.getPrice();	
		}	
		
		// Apply offers and calculate total
		double discountGetOneFree = Offer.getOfferBuyOneGetOneFree(getFruitNameList(), new Apple() );
		discountGetOneFree += Offer.getOfferBuyOneGetOneFree(getFruitNameList(), new Banana() );
		double discountThreeForTwo = Offer.getOfferThreeForTwo(getFruitNameList(), new Orange() );
		discountThreeForTwo += Offer.getOfferThreeForTwo(getFruitNameList(), new Melon() );		
		double discountCheapestForFree = Offer.cheapestFruitForFree(getFruitList());
		total += - discountGetOneFree - discountThreeForTwo - discountCheapestForFree;
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
		// Print out the total cost and saving
		System.out.println(String.format("£ %s Total cost", df.format(total)));
		if (discountGetOneFree > 0)
			System.out.println(String.format("£ %s Promotional Saving *** Buy One Get One Free ***", df.format(discountGetOneFree)));
		if (discountThreeForTwo > 0)
			System.out.println(String.format("£ %s Promotional Saving *** 3 for the price of 2 ***", df.format(discountThreeForTwo)));
		if (discountCheapestForFree > 0)
			System.out.println(String.format("£ %s Promotional Saving *** Cheapest for free ***", df.format(discountCheapestForFree)));
					
		return total;		
	}
}