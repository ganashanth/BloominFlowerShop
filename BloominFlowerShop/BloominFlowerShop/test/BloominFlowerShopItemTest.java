
import bloominflowershop.FlowerShopItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ganashanth Sugumaran
 */
public class BloominFlowerShopItemTest {

    @Test
    public void testIncreaseStockLevel() {
        FlowerShopItem stockItem = new FlowerShopItem("bouquet", 2.5, "red");
        stockItem.increaseStockLevel(5);
        int currentStockLevel = stockItem.getStockLevel();
        assertEquals(5, currentStockLevel);
    }

    @Test
    public void testDecreaseStockLevel() {
        FlowerShopItem stockItem = new FlowerShopItem("bouquet", 2.5, "red");
        stockItem.increaseStockLevel(5);
        stockItem.decreaseStockLevel(2);
        int currentStockLevel = stockItem.getStockLevel();
        assertEquals(3, currentStockLevel);
    }

    @Test
    public void testGetStockValue() {
        FlowerShopItem stockItem = new FlowerShopItem("bouquet", 2.5, "red");
        stockItem.increaseStockLevel(5);
        double stockValue = stockItem.getStockValue();
        assertEquals(12.5, stockValue, 0.01);
    }

}
