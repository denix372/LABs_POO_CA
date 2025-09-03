package lab5.task4;

public class BadAlbum extends Album{
    @Override
    public void addSong(Song song) {
        if( isPal(song.getId()) && song.getName().length() == 3) {
            songs.add(song);
        }
    }

    private boolean isPal(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }
}
