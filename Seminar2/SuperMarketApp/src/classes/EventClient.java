package classes;

public class EventClient extends BaseClient {
    private int idClient;
    private static int minId;
    private static int maxId;
    private static String eventName;

    public EventClient(String name, int idClient) {
        super(name);
        this.idClient = idClient;
    }

    /**
     * @apiNote Узнать минимальный диапазон id клиентов в акции
     * @return минимальный id клиентов
     */
    public static int getMinId() {
        return minId;
    }

    /**
     * @apiNote Узнать максимальный диапазон id клиентов в акции
     * @return максимальный id клиентов
     */
    public static int getMaxId() {
        return maxId;
    }

    /**
     * @apiNote Задать диапазон id клиентов в акции
     * @param min минимальный id
     * @param max максимальный id
     */
    public static void setIdRange(int min, int max) {
        minId = min;
        maxId = max;
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
        return this.idClient >= minId && this.idClient <= maxId;
    }

    @Override
    public String toString() {
        return "EventClient [idClient=" + idClient +
                " name=" + super.name + "]";
    }
}