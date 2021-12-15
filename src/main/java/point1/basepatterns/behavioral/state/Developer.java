package point1.basepatterns.behavioral.state;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (this.activity instanceof Coding) {
            this.activity = new Reading();
        } else if (this.activity instanceof Reading) {
            this.activity = new Sleeping();
        } else if (this.activity instanceof Sleeping) {
            this.activity = new Training();
        } else if (this.activity instanceof Training) {
            this.activity = new Coding();
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
