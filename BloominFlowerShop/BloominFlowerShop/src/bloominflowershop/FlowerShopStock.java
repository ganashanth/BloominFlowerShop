package bloominflowershop;

import bloominflowershop.FlowerShopItem;
import bloominflowershop.FlowerShopItem;
import java.util.ArrayList;

/**
 * @author Ganashath Sugumaran
 */
public class FlowerShopStock {

    private ArrayList<FlowerShopItem> stockItems = new ArrayList<>();

    /**
     * Creating a function to add stock items to the array list
     */
    public void addStockItem(FlowerShopItem stockItem) {
        this.stockItems.add(stockItem);
    }

    /**
     * @param productId
     * @return StockLevel of product and return -1 if no stock
     */
    public int getStockLevelForProduct(String productId) {
        for (FlowerShopItem stockItem : stockItems) {
            if (stockItem.getProductId().equalsIgnoreCase(productId)) {
                return stockItem.getStockLevel();
            }
        }

        return -1;
    }

    /**
     * @param productId
     * @return Total value of each Product and return -1.0 if no stock
     */
    public double getTotalValueForProduct(String productId) {
        for (FlowerShopItem stockItem : stockItems) {
            if (stockItem.getProductId().equalsIgnoreCase(productId)) {
                return stockItem.getStockValue();
            }
        }

        return -1.0;
    }

    /**
     * @return total value of all the stock available
     */
    public double getTotalValueInStock() {
        double totalValue = 0;
        for (FlowerShopItem stockItem : stockItems) {
            totalValue += stockItem.getStockValue();
        }

        return totalValue;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (FlowerShopItem item : stockItems) {
            sb.append(item.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
