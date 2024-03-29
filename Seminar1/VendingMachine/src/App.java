import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static List<Product> assort = new ArrayList<>(); 

    public static List<Product> getAssort() { // Метод для доступа к assort
        return assort;
    }

    public static void main(String[] args) throws Exception {


        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float)1.5);
        Product item4 = new HotDrink(180, 4, "Coffe", 102, (int)60);
        Product item5 = new HotDrink(60, 5, "Tea", 103, (int)80);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        for(Object prod: venMachine.getProducts()) {
            Product product = (Product) prod;
            System.out.println(product);
        }

        MainFrame myFrame = new MainFrame();
        myFrame.initialize();

    }
}