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
	public void addAppleToBasketTest() {
		basket.addFruit(new Apple());
	    assertThat(basket.getFruitList().size(), is(1));
	    assertThat(basket.getFruitNameList().contains(Fruit.APPLE_NAME), is(true));
	}
	
	@Test
	public void addOrangeToBasketTest() {
		basket.addFruit(new Orange());
	    assertThat(basket.getFruitList().size(), is(1));
	    assertThat(basket.getFruitNameList().contains(Fruit.ORANGE_NAME), is(true));
	}
	
	@Test
	public void addMelonToBasketTest() {
		basket.addFruit(new Melon());
	    assertThat(basket.getFruitList().size(), is(1));
	    assertThat(basket.getFruitNameList().contains(Fruit.MELON_NAME), is(true));
	}
	
	@Test
	public void addBananaToBasketTest() {
		basket.addFruit(new Banana());
	    assertThat(basket.getFruitList().size(), is(1));
	    assertThat(basket.getFruitNameList().contains(Fruit.BANANA_NAME), is(true));
	}

}