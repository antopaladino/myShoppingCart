package com.shop;

/**
 * This class represent the fruit and its subclass used by the system
 * 
 * @author Antonio Paladino
 *
 */
		
public class Fruit {
	static final String APPLE_NAME = "apple";
	static final String ORANGE_NAME = "orange";
	static final double APPLE_PRICE = 0.25;
	static final double ORANGE_PRICE = 0.6;
	static final String BANANA_NAME = "banana";
	static final double BANANA_PRICE = 0.2;
	
	private String name;
	private double price;
	
	
	/**
	 * Class constructor setting the name
	 */
	public Fruit(String name) {
		this.setName(name);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
 
}

class Apple extends Fruit {
	
	/**
	 * Class constructor setting the price
	 */
	public Apple() {
		super(APPLE_NAME);
		this.setPrice(APPLE_PRICE);
	}
}

class Orange extends Fruit {

	/**
	 * Class constructor setting the price
	 */
	public Orange() {
		super(ORANGE_NAME);
		this.setPrice(ORANGE_PRICE);
	}
}

class Banana extends Fruit {
	
	/**
	 * Class constructor setting the price
	 */
	public Banana() {
		super(BANANA_NAME);
		this.setPrice(BANANA_PRICE);
	}
}
