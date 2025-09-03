package lab5.task4;

public class Test {
    public static void main(String[] args) {
        Song s1 = new Song("Bad", 121, "Michael Jackson");
        Song s2 = new Song("Pop", 44, "Michael Jackson");
        Song s3 = new Song("Rock", 17, "Queen");
        Song s4 = new Song("Rap", 22, "Drake");
        Song s5 = new Song("Hit", 4, "Michael Jackson");
        Song s6 = new Song("Jazz", 9, "Miles Davis");
        Song s7 = new Song("Pop", 123, "Michael Jackson");

        Album dangerous = new DangerousAlbum();
        Album thriller = new ThrillerAlbum();
        Album bad = new BadAlbum();

        dangerous.addSong(s1);
        dangerous.addSong(s2);
        dangerous.addSong(s3);
        dangerous.addSong(s6);

        thriller.addSong(s1);
        thriller.addSong(s2);
        thriller.addSong(s5);
        thriller.addSong(s7);

        bad.addSong(s1);
        bad.addSong(s2);
        bad.addSong(s4);
        bad.addSong(s7);

        System.out.println("\nDangerousAlbum:");
        System.out.println(dangerous);

        System.out.println("\nThrillerAlbum:");
        System.out.println(thriller);

        System.out.println("\nBadAlbum:");
        System.out.println(bad);
    }
}
