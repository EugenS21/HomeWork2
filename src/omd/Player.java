package behavioural;

public class Player implements IObservable {
    private String songTitle;
    private String songArtist;
    private String songDuration;

    public Player(){
        this.songDuration = null;
        this.songTitle = null;
        this.songArtist = null;
    }

    public Player(String songTitle, String songArtist, String songDuration) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songDuration = songDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public String getSongDuration() {
        return songDuration;
    }

    public void updateSong (String songTitle, String songArtist, String songDuration){
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songDuration = songDuration;
    }

    @Override
    public Player notifyObserver() {
        return this;
    }
}
