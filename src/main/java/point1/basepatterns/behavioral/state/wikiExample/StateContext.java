package point1.basepatterns.behavioral.state.wikiExample;

public class StateContext {
    private State state = new SolidState();

    public void freeze() {
        System.out.println("Freezing " + state.getName() + " substance...");
        state.freeze(this);
    }

    public void heat(){
        System.out.println("Heating " + this.state.getName() + " substance...");
        state.heat(this);
    }

    public void setState(State state) {
        System.out.println("Changing state to " + state.getName() + " ... ");
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}
