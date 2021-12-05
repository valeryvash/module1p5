package point1.basepatterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        List<Thread> threadList = new ArrayList<>();

        threadList.add(new Thread(() -> Singleton.getInstance().writeInFile("Thread one message! " + Singleton.getInstance().toString())));
        threadList.add(new Thread(() -> Singleton.getInstance().writeInFile("Thread two message! "+ Singleton.getInstance().toString())));
        threadList.add(new Thread(() -> Singleton.getInstance().writeInFile("Thread three message! " + Singleton.getInstance().toString())));
        threadList.add(new Thread(() -> Singleton.getInstance().writeInFile("Thread fourth message! " + Singleton.getInstance().toString())));
        threadList.add(new Thread(() -> Singleton.getInstance().writeInFile("Thread five message! " + Singleton.getInstance().toString())));

        threadList.forEach(Thread::start);

        threadList.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        });

        System.out.println("Threads completed");
        Singleton.getInstance().showFileContent();
    }
}
