package bloominflowershop;

import bloominflowershop.StockReader;
import bloominflowershop.FlowerShopItem;
import bloominflowershop.FlowerShopItem;

/**
 * @author Ganashanth Sugumaran
 */
public class FlowerShopStockDemo {

    public static void main(String[] args) {
        FlowerShopStock stock = new FlowerShopStock();
        FlowerShopItem rose = new FlowerShopItem("Rose", 2.5, "red");
        assert rose.getProductId().equals("id001");
        FlowerShopItem lilac = new FlowerShopItem("Lilac", 3.0, "yellow");
        assert rose.getProductId().equals("id002");
        FlowerShopItem vase = new FlowerShopItem("Vase", 4.0, "blue");
        assert rose.getProductId().equals("id003");
        FlowerShopItem pot = new FlowerShopItem("Pot", 5.99, "Black");
        assert rose.getProductId().equals("id004");
        System.out.println("rose:\"id001\", lilac:\"id002\", vase:\"id003\", pot:\"id004\"");
        rose.increaseStockLevel(2);
        lilac.increaseStockLevel(3);
        vase.increaseStockLevel(4);
        pot.increaseStockLevel(0);

        stock.addStockItem(rose);
        stock.addStockItem(lilac);
        stock.addStockItem(vase);
        stock.addStockItem(pot);

        System.out.println("id001 stocklevel: " + stock.getStockLevelForProduct("id001"));
        System.out.println("id002 stocklevel: " + stock.getStockLevelForProduct("id002"));
        System.out.println("id003 stocklevel: " + stock.getStockLevelForProduct("id003"));
        System.out.println("id004 stocklevel: " + stock.getStockLevelForProduct("id004"));
        System.out.println("id005 stocklevel(Should Return -1): " + stock.getStockLevelForProduct("id005"));

        System.out.println("id001 stock Value: £" + stock.getTotalValueForProduct("id001"));
        System.out.println("id002 stock Value: £" + stock.getTotalValueForProduct("id002"));
        System.out.println("id003 stock Value: £" + stock.getTotalValueForProduct("id003"));
        System.out.println("id004 stock Value: £" + stock.getTotalValueForProduct("id004"));
        System.out.println("id005 stock Value(should Return -1.0): " + stock.getTotalValueForProduct("id005"));

        System.out.println("Total Stock Value of all products: £" + stock.getTotalValueInStock());
    }
}
