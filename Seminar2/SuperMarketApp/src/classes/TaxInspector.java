package classes;

import interfaces.iActorBehaviour;
import interfaces.iReturnOrder;

public class TaxInspector implements iActorBehaviour, iReturnOrder {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxInspector() {
        this.name = "Налоговый инспектор";
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient("Тайный клиент");
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setMakeOrder(boolean trueOrFalse) {
        isMakeOrder = trueOrFalse;
    }

    public void setTakeOrder(boolean trueOrFalse) {
        isTakeOrder = trueOrFalse;
    }

    @Override
    public void returnOrder() {
        System.out.println(getActor().getName() + " производит возврат заказа");
    }
}
