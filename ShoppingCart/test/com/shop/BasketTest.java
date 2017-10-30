package com.shop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Class defines unit tests for the shopping basket
 * 
 * @author Antonio Paladino
 *
 */
public class BasketTest {

	Basket basket;

	@Before
	public void setUp(){
		basket = new Basket();
	}

	@Test
	public void addOneAppleToBasket() {
		basket.addFruit(new Apple());
	    assertThat(basket.getFruitList().size(), is(1));
	    assertThat(basket.getFruitNameList().contains(Fruit.APPLE_NAME), is(true));
	}
	
	@Test
	public void addOneOrangeToBasket() {
		basket.addFruit(new Orange());
	    assertThat(basket.getFruitList().size(), is(1));
	    assertThat(basket.getFruitNameList().contains(Fruit.ORANGE_NAME), is(true));
	}
	
	@Test 
	public void checkoutBasketWithTwoOranges(){
		basket.addFruit(new Orange());
		basket.addFruit(new Orange());
		double total = basket.checkout();
		assertThat(basket.getFruitList().size(), is(2));
		assertThat(total, is(2*Fruit.ORANGE_PRICE));
	}
	
	@Test 
	public void checkoutBasketWithThreeFruits(){
		basket.addFruit(new Apple());
		basket.addFruit(new Orange());
		basket.addFruit(new Banana());
		double total = basket.checkout();
		assertThat(basket.getFruitList().size(), is(3));
		assertThat(total, is(Fruit.APPLE_PRICE + Fruit.ORANGE_PRICE + Fruit.BANANA_PRICE));
	}

}