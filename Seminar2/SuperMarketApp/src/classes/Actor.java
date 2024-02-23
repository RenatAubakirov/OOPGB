package classes;

import interfaces.iActorBehaviour;
import interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * @apiNote Конструктор
     * @param name имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * @apiNote Возвращает имя клиента
     * @return имя клиента
     */
    abstract String getName();

    /**
     * @apiNote Задаёт имя клиента
     * @param name имя клиента
     */
    abstract void setName(String name);

    @Override
    public void returnOrder() {
        System.out.println("Возврат товара в магазин от клиента " + this.getName());
    }
}
