package bloominflowershop;

/**
 *
 * @author Ganashanth Sugumaran
 */
public class FlowerShopItem {

    private static int counter = 0;
    private String productId;
    private String description;
    private double price;
    private String color;
    private int stockLevel;

    public FlowerShopItem() {
        this.productId = "id" + String.format("%03d", ++counter);
        description = new String();
        color = new String();
    }

    public FlowerShopItem(String description, double price, String color) {
        this.productId = "id" + String.format("%03d", ++counter);
        this.description = description;
        this.price = price;
        this.color = color;
    }

    /**
     * This method will increase the stock level by the value provided by
     * amountToIncrease
     *
     * @param amountToIncrease
     * @return the current stock level
     */
    public int increaseStockLevel(int amountToIncrease) {
        this.stockLevel = this.stockLevel + amountToIncrease;
        return this.stockLevel;
    }

    /**
     * This method will decrease the stock level by the value provided by
     * amountToDecrease
     *
     * @param amountToDecrease
     * @return true if the decrease is valid. false if the parameter passed is
     * larger than the available stock level
     */
    public boolean decreaseStockLevel(int amountToDecrease) {
        if (this.stockLevel - amountToDecrease < 0) {
            return false;
        } else {
            this.stockLevel = this.stockLevel - amountToDecrease;
            return true;
        }
    }

    public int getStockLevel() {
        return this.stockLevel;
    }

    /**
     * This will provide the total money value of the stock level
     *
     * @return total money value
     */
    public double getStockValue() {
        return this.stockLevel * this.price;
    }

    @Override
    public String toString() {
        return "BloominFlowerShopStockItem{" + "productId=" + productId + ", description=" + description + ", price=" + price + ", color=" + color + ", stockLevel=" + stockLevel + '}';
    }

    //Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
