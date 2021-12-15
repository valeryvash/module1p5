package point1.basepatterns.behavioral.command.wikiexample;

public class CommandDemo {
    public static void main(String[] args) {

        // Change object state via interface methods
        Light lamp = new Light();

        Command switchOn = lamp::turnOn;
        Command switchOff = lamp::turnOff;

        Switch mySwitch = new Switch();
        mySwitch.register("on", switchOn);
        mySwitch.register("off", switchOff);

        mySwitch.execute("on");
        mySwitch.execute("off");

    }
}
