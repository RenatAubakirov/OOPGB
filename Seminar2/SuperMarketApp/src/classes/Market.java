package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.iActorBehaviour;
import interfaces.iMarketBehaviour;
import interfaces.iQueueBehaviour;
import interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {
    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getActor().getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
        for (iActorBehaviour actor : queue) {
            initiateReturn(actor);
            processReturn(actor);
        }
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }

    @Override
    public void initiateReturn(iActorBehaviour actor) {
        // Реализация инициирования возврата товара
        if (queue.contains(actor)) {
            System.out.println(actor.getActor().getName() + " клиент инициировал возврат товара ");
        }
    }

    @Override
    public void processReturn(iActorBehaviour actor) {
        // Реализация обработки возврата товара
        if (queue.contains(actor)) {
            System.out.println(actor.getActor().getName() + " клиент вернул товар ");
        }
    }
}
