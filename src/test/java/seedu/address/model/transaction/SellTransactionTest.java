package seedu.address.model.transaction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class SellTransactionTest {
    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new SellTransaction(null, null, null));
    }

    @Test
    public void totalCost() {
        Goods goods = new Goods("Apple");
        Price price = new Price("0.8");
        Quantity quantity = new Quantity("10");

        Transaction transaction = new SellTransaction(goods, price, quantity);
        assertEquals(transaction.totalCost(), 8);
        assertFalse(transaction.totalCost() == -8);
    }

    @Test
    public void testToString() {
        Goods goods = new Goods("Apple");
        Price price = new Price("0.8");
        Quantity quantity = new Quantity("10");

        Transaction transaction = new SellTransaction(goods, price, quantity);
        assertTrue(transaction.toString().equals("You sold 10 quantity of Apple at $0.8 each"));
    }

}
