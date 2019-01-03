package bloominflowershop;

import java.io.IOException;

public class StockReaderDemo {

    public static void main(String[] args) throws IOException {
        StockReader cr = new StockReader("FlowerShop.csv");
        System.out.println(cr.getCatalogue().toString());

    }

}
