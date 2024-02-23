package interfaces;

import java.util.List;

import classes.Actor;

public interface iMarketBehaviour {
    /**
     * @apiNote Действия клиента, приходящего в магазин
     * @param actor клиентский объект
     */
    public void acceptToMarket(iActorBehaviour actor);

    /**
     * @apiNote Действия клиента при уходе из магазина
     * @param actor клиентский объект
     */
    public void releaseFromMarket(List<Actor> actors);

    /**
     * @apiNote Описывает весь процесс с приобретения товара до момента ухода
     */
    public void update();
}

