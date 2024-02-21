package classes;
/**
 * Класс, представляющий акционного клиента.
 * Унаследован от класса Actor.
 */
public class PromoClient extends Actor {
    // Поля класса
    private int idPromo; // Идентификатор акции
    private String promoName; // Название акции
    private static int participantsCount; // Количество участников акции (поле статическое)

    /**
     * Конструктор класса PromoClient.
     *
     * @param name Имя акционного клиента.
     * @param idPromo Идентификатор акции.
     * @param promoName Название акции.
     * @param participantsCount Количество участников акции.
     */
    public PromoClient(String name, int idPromo, String promoName, int participantsCount) {
        super(name); // Вызов конструктора суперкласса для установки имени клиента
        this.idPromo = idPromo;
        this.promoName = promoName;
        PromoClient.participantsCount = participantsCount; // Установка количества участников акции
    }


    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setMakeOrder(boolean isCreated) {
        super.isMakeOrder = isCreated;
    }

    public void setTakeOrder(boolean isCreated) {
        super.isTakeOrder = isCreated;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    String getName() {
        return super.name;
    }

    @Override
    void setName(String name) {
        super.name = name;
    }


    @Override
    public boolean canReturn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canReturn'");
    }
}
