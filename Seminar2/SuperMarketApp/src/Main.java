import classes.Actor;
import classes.BaseClient;
import classes.EventClient;
import classes.Market;
import classes.OrdinaryClient;
import classes.SpecialClient;
import classes.TaxInspector;

public class Main {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Коля");
        Actor client2 = new OrdinaryClient("Лена");
        Actor client3 = new SpecialClient("Президент", 777);
        TaxInspector client4 = new TaxInspector();

        EventClient.setEventName("First event");
        EventClient.setIdRange(1, 2); // Установка диапазона id клиентов в акции
        EventClient client5 = new EventClient("Вера", 1);
        EventClient client6 = new EventClient("Саша", 2);
        EventClient client7 = new EventClient("Дима", 3);
        EventClient client8 = new EventClient("Рома", 4);
        System.out.println("Действующая акция " + EventClient.getEventName());
        checkEventForClient(client5);
        checkEventForClient(client6);
        checkEventForClient(client7);
        checkEventForClient(client8);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        magnit.update();
        client4.returnOrder();
        client6.returnOrder();
        client1.returnOrder();
    }

    /**
     * @apiNote Выводит в stdout относится ли клиент к текущей акции
     * @param client клиент для проверки
     */
    public static void checkEventForClient(EventClient client) {
        if (client.isClientCurrentEvent()) {
            System.out.println(client + " является клиентом акции");
        } else {
            System.out.println(client + " Не является клиентом акции");
        }
    }
}