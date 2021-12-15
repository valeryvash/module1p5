package point1.basepatterns.structural.composite.myexample;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Orchestra or = new Orchestra();

        or.addMusicianInstrument(new Cello());
        or.addMusicianInstrument(new Flute());
        or.addMusicianInstrument(new Oboe());
        or.addMusicianInstrument(new Viola());
        or.addMusicianInstrument(new Violin());

        or.startConcert();

        // super short concert
        Thread.sleep(10000L);

        or.stopConcert();

        System.out.println("Ovations!!!");
    }
}
