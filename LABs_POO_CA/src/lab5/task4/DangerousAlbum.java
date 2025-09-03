package lab5.task4;

public class DangerousAlbum extends Album {
    @Override
    public void addSong(Song song) {
        if( isPrime(song.getId())) {
            songs.add(song);
        }
    }

    private boolean isPrime(int number) {
        if(number < 2)
            return false;
        else if(number == 2)
            return true;
        else if(number %2 == 0)
            return false;
        else{
            for(int i = 2; i*i <= number; i += 2)
                if(number%i == 0)
                    return false;
        }
        return true;
    }
}
