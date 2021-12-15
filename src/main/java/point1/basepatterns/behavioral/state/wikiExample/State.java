package point1.basepatterns.behavioral.state.wikiExample;

public interface State {
    String getName();

    void freeze(StateContext context);

    void heat(StateContext context);
}
