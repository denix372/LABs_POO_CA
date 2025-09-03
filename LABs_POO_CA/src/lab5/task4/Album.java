package lab5.task4;

import lab5.task1.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class Album {
    protected List<Song> songs = new ArrayList<>();

    public abstract void addSong(Song song);

    public void removeSong(Song song) {
        songs.remove(song);
    }

    @Override
    public String toString() {
        return "Album {\nsongs =" + songs + "}";
    }
}
