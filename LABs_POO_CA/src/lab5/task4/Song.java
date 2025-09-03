package lab5.task4;

public class Song {
    String name, composer;
    int id;

    public Song(String name, int id, String composer) {
        this.id = id;
        this.name = name;
        this.composer = composer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Song { name = " + this.name + " , id = " + this.id +
                " , composer = " + this.composer + "\n";
    }
}
