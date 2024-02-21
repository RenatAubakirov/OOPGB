package interfaces;

import java.util.List;

import classes.Actor;

public interface iMarketBehaviour {
    public void acceptToMarket(iActorBehaviour actor);
    public void releaseFromMarket(List<Actor> actors);
    public void update();
}

