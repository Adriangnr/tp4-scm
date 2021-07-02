package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sample.entity.Item;
import sample.model.CartItem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartItemTest {

    CartItem cartItem = new CartItem();

    @Test
    public void isInStockTest(){
        this.cartItem.setInStock(true);
        assertTrue(this.cartItem.isInStock());
    }

    @Test
    public void incrementQuantityTest(){
        this.cartItem.setQuantity(20);
        this.cartItem.incrementQuantity();
        assertEquals(21, this.cartItem.getQuantity());
    }
}
