package com.shop;

import java.util.Collections;
import java.util.List;

/**
 * The class defines the promotional saving offers
 * 
 * @author Antonio Paladino
 *
 */
public class Offer {

	/**
	 * Calculate the discount for the Buy 1 Get 1 free offer
	 * 
	 * @param fruitNameList fruit list names
	 * @param item fruit on offer
	 * @return discount
	 */
	public static double getOfferBuyOneGetOneFree(List<String> fruitNameList, Fruit item){
    	double discount=0;
    	
		int occurrencesFruit = Collections.frequency(fruitNameList, item.getName());
    	if (occurrencesFruit > 1){
    		if (occurrencesFruit % 2 == 0){
    			discount = (occurrencesFruit/2) * item.getPrice();
    		} else {
    			discount = ((occurrencesFruit-1)/2) * item.getPrice();
    		}
    	}
    	return discount;
	}
	
	/**
	 * Calculate the discount for the 3 for 2 price offer
	 * 
	 * @param fruitNameList fruit list names
	 * @param item fruit on offer
	 * @return discount
	 */
	public static double getOfferThreeForTwo(List<String> fruitNameList, Fruit item){
		// apply discount orange
    	double discount=0;
    	int occurrences = Collections.frequency(fruitNameList, item.getName());
    	if (occurrences >= 3){
    		if (occurrences % 3 == 0){
    			discount = (occurrences/3) * item.getPrice();
    		} else {
    			discount = ((occurrences - (occurrences % 3)) / 3) * item.getPrice();
    		}
    	}
    	return discount;
	}
}