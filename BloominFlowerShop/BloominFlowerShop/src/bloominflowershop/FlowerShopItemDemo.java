package bloominflowershop;

/**
 *
 * @author Ganashanth Sugumaran
 */
public class FlowerShopItemDemo {

    public static void main(String[] args) {
        FlowerShopItem stockItem = new FlowerShopItem("bouquet", 2.5, "red");

        System.out.println(stockItem.toString());

        System.out.println("Let's increase the stock by 5 and print the output");
        stockItem.increaseStockLevel(5);
        System.out.println(stockItem.getStockLevel());

        System.out.println("Let's decrease the stock by 2 and print the output.");
        stockItem.decreaseStockLevel(2);
        System.out.println(stockItem.getStockLevel());

        System.out.println("Let's try to decrease the stock level by another 4, it has to return false.");
        System.out.println(stockItem.decreaseStockLevel(4));
        System.out.println("So current Stock Level remains");
        System.out.println(stockItem.getStockLevel());

        System.out.println("Let's get the money value of current stock level");
        System.out.println(stockItem.getStockValue());
    }
}
