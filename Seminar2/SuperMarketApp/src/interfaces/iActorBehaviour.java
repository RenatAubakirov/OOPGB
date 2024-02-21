package interfaces;

import classes.Actor;

public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean isCreated);
    public void setMakeOrder(boolean isCreated);
    public Actor getActor();
    public boolean canReturn();
}

