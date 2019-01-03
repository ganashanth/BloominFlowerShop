package bloominflowershop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StockReader {

    private FlowerShopStock catalogue;

    public StockReader(String csvPath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(csvPath));
        catalogue = new FlowerShopStock();
        String line;
        String seperator = ",";
        int descriptionId = 0;
        int priceId = 1;
        int colourId = 2;
        boolean first = true;
        while ((line = br.readLine()) != null) {
            if (first) {
                first = false;
                continue;
            }
            String[] data = line.split(seperator);
            if (data.length == 3) {
                String desc = data[descriptionId];
                float price = Float.parseFloat(data[priceId]);
                String colour = data[colourId];
                catalogue.addStockItem(new FlowerShopItem(desc, price, colour));
            }
        }
    }

    public FlowerShopStock getCatalogue() {
        return catalogue;
    }
}
