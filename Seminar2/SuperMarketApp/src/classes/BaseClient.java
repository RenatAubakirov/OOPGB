package classes;

public class BaseClient extends Actor {

    public BaseClient(String name) {
        super(name);
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setMakeOrder(boolean trueOrFalse) {
        super.isMakeOrder = trueOrFalse;
    }

    public void setTakeOrder(boolean trueOrFalse) {
        super.isTakeOrder = trueOrFalse;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}