package point1.basepatterns.behavioral.memento.wikiexample;

import point1.basepatterns.behavioral.iterator.Iterator;

public class Application {
    public static void main(String[] args) {
        Originator originator = new Originator();
//        Caretaker caretaker = new Caretaker();
        PulledCaretaker caretaker = new PulledCaretaker();

//        originator.setState("on");
//        System.out.printf("State is %s\n", originator.getState());
//        caretaker.setMemento(originator.saveState());
//
//        originator.setState("Off");
//        System.out.printf("State is %s\n", originator.getState());
//
//        originator.restoreState(caretaker.getMemento());
//        System.out.printf("State is %s\n", originator.getState());

        originator.setState("1");
        caretaker.addMemento(originator.saveState());
        originator.setState("2");
        caretaker.addMemento(originator.saveState());
        originator.setState("3");
        caretaker.addMemento(originator.saveState());
        originator.setState("4");
        caretaker.addMemento(originator.saveState());
        originator.setState("5");
        caretaker.addMemento(originator.saveState());


        Iterator it = caretaker.getIterator();

        System.out.println("Pulled memento (with iterator) in action");

        while (it.hasNext()) {
            Memento memento = (Memento) it.next();
            originator.restoreState(memento);
            System.out.printf("State is %s\n", originator.getState());
        }
    }
}
