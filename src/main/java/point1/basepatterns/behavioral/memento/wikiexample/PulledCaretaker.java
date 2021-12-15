package point1.basepatterns.behavioral.memento.wikiexample;

import point1.basepatterns.behavioral.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class PulledCaretaker {
    private List<Memento> list = new ArrayList<>();

    public PulledCaretaker() {
    }

    public void addMemento(Memento memento) {
        list.add(memento);
    }

    public Memento getMemento() {
        return list.get(list.size() - 1);
    }

    Iterator getIterator() {
        return new MementoIterator();
    }

    private class MementoIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            if (index < list.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return list.get(index++);
        }
    }

}
