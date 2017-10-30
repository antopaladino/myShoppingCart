package com.shop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Class defines unit tests
 * 
 * @author Antonio Paladino
 *
 */
public class OfferTest {

	Basket basket;

	@Before
	public void setUp(){
		basket = new Basket();
	}

	@Test
	public void getOfferBuyOneGetOneFreeOnAppleTest() {
		basket.addFruit(new Apple());
		basket.addFruit(new Apple());
		double discount = Offer.getOfferBuyOneGetOneFree(basket.getFruitNameList(), new Apple());
		assertThat(discount, is(Fruit.APPLE_PRICE));
	}
	
	@Test
	public void getOfferBuyOneGetOneFreeOnBananaTest() {
		basket.addFruit(new Banana());
		basket.addFruit(new Banana());
		double discount = Offer.getOfferBuyOneGetOneFree(basket.getFruitNameList(), new Banana());
		assertThat(discount, is(Fruit.BANANA_PRICE));
	}
	
	@Test
	public void getOfferThreeForTwoOnOrangeTest() {
		basket.addFruit(new Orange());
		basket.addFruit(new Orange());
		basket.addFruit(new Orange());
		double discount = Offer.getOfferThreeForTwo(basket.getFruitNameList(), new Orange());
		assertThat(discount, is(Fruit.ORANGE_PRICE));
	}
	
	@Test
	public void cheapestFruitForFreeTest() {
		basket.addFruit(new Apple());
		basket.addFruit(new Banana());
		double discount = Offer.cheapestFruitForFree(basket.getFruitList());
		assertThat(discount, is(Fruit.BANANA_PRICE));
	}
	
}