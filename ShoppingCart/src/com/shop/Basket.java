package com.shop;

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
		return total;		
	}
}