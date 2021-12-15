package point1.basepatterns.structural.composite.myexample;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    List<MusicianInstrument> musicianInstruments = new ArrayList<>();

    public void addMusicianInstrument(MusicianInstrument musicianInstrument) {
        musicianInstruments.add(musicianInstrument);
    }

    public void removeMusicianInstrument(MusicianInstrument musicianInstrument) {
        musicianInstruments.remove(musicianInstrument);
    }

    public void startConcert() {
        System.out.println("Concert started");
        for (MusicianInstrument mi : musicianInstruments) {
            mi.play();
        }
    }

    public void stopConcert() {
        System.out.println("Concert stopped");
        for (MusicianInstrument mi : musicianInstruments) {
            mi.stop();
        }
    }
}
