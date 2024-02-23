package classes;

public class EventClient extends BaseClient {
    private int idClient;
    private static int amountEventCount = 10;
    private static String eventName;


    public EventClient(String name, int idClient) {
        super(name);
        this.idClient = idClient;
    }

    /**
     * @apiNote Узнать какое количество клиентов максимально в акции
     * @return кол-во клиентов
     */
    public static int getAmountEventCount() {
        return amountEventCount;
    }

    /**
     * @apiNote Задать максимальное количество клиентов в акции
     * @param amountEventCount максимальное кол-во
     */
    public static void setAmountEventCount(int amountEventCount) {
        EventClient.amountEventCount = amountEventCount;
    }

    /**
     * @apiNote Получить текущее название акции
     * @return название акции
     */
    public static String getEventName() {
        return eventName;
    }

    /**
     * Задать текущие название для акции
     * @param eventName имя текущей акции
     */
    public static void setEventName(String eventName) {
        EventClient.eventName = eventName;
    }

    /**
     * @apiNote Проверка попал ли клиент в эту акцию
     * @return true | false
     */
    public boolean isClientCurrentEvent() {
        return this.idClient <= amountEventCount;
    }

    @Override
    public String toString() {
        return "EventClient [idClient=" + idClient +
                " name=" + super.name + "]";
    }
}

