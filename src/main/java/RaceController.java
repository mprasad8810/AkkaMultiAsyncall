import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Receive;

import java.io.Serializable;

public class RaceController extends AbstractBehavior<RaceController.Command>{

    public interface Command extends Serializable{}

    public RaceController(ActorContext context) {
        super(context);
    }

    @Override
    public Receive createReceive() {
        return null;
    }
}
