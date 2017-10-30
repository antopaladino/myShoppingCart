# shoppingCart
Shopping cart system implemented in Java

This is a Shopping Cart system implemented in Java. The system allows the user to add fruit to the shopping cart, calculate the total cost of the basket, and apply any special offer, if applicable.

Use Maven to compile, package and test the Java project as shown below.

Package:
```
cd ShoppingCart
mvn clean package
```

Run:
```
java -cp target/classes com.shop.Main
java -cp target/classes com.shop.Main orange, apple
java -jar target/shopping-cart-0.0.1-SNAPSHOT.jar
```

Only valid fruit items will be added to the shopping cart.

The total cost of the shopping cart is calculated, and printed out at the end of the checkout process.
