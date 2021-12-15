package point1.basepatterns.behavioral.state.wikiExample;

public class GaseousState implements State {

    private static final String NAME = "GAS";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void freeze(StateContext context) {
        context.setState(new LiquidState());
    }

    @Override
    public void heat(StateContext context) {
        System.out.println("Nothing happens");
    }
}
