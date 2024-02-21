import classes.Actor;
import classes.Market;
import classes.OrdinaryClient;
import classes.PromoClient;
import classes.SpecialClient;
import classes.TaxInspector;

public class Main {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Толя");
        Actor client2 = new OrdinaryClient("Оля");
        Actor client3 = new SpecialClient("Президент", 777);
        TaxInspector client4 = new TaxInspector();
        Actor client5 = new PromoClient("Саша", 21, "2 по цене 3", 5);
        

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);

        magnit.update();
    }
}

