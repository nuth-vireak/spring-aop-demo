package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String status) {

        //Logging
        //Authentication & Authorization
        //Sanitize the Data
        System.out.println("Checkout Method from Shopping Cart called");
    }

    public int quantity() {
        return 2;
    }
}
