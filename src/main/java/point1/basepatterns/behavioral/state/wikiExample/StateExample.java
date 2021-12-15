package point1.basepatterns.behavioral.state.wikiExample;

public class StateExample {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext();

        stateContext.heat();
        stateContext.heat();
        stateContext.heat();
        stateContext.freeze();
        stateContext.heat();
        stateContext.heat();
        stateContext.freeze();
        stateContext.freeze();
        stateContext.heat();
    }
}
