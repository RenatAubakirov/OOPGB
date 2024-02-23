package interfaces;

import classes.Actor;

public interface iActorBehaviour {
    /**
     * @apiNote Проверка забрал ли клиент заказ
     * @return true | false
     */
    public boolean isTakeOrder();

    /**
     * @apiNote Проверка сделал ли клиент заказ
     * @return true | false
     */
    public boolean isMakeOrder();

    /**
     * @apiNote Изменяет признак забрал ли клиент заказ
     * @param trueOrFalse признак
     */
    public void setTakeOrder(boolean trueOrFalse);

    /**
     * @apiNote Изменяет признак сделал ли клиент заказ
     * @param trueOrFalse признак
     */
    public void setMakeOrder(boolean trueOrFalse);

    /**
     * @apiNote Возможность получить объект клиента
     * @return объект клиента
     */
    public Actor getActor();
}
