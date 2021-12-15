package point1.basepatterns.behavioral.state.wikiExample;

public class SolidState implements State {

    private static final String NAME = "SOLID";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void freeze(StateContext context) {
        System.out.println("Nothing happens");
    }

    @Override
    public void heat(StateContext context) {
        context.setState(new LiquidState());
    }
}
