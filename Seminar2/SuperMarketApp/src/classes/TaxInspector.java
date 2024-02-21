package classes;

import interfaces.iActorBehaviour;

public class TaxInspector implements iActorBehaviour{
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

    public void setMakeOrder(boolean isCreated) {
        isMakeOrder = isCreated;
    }

    public void setTakeOrder(boolean isCreated) {
        isTakeOrder = isCreated;
    }

    @Override
    public boolean canReturn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canReturn'");
    }

}
