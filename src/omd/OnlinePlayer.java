package behavioural;

public class OnlinePlayer implements IObserver {
    private String songTitle;
    private String songArtist;
    private String songDuration;
    private IObservable myObservable;

    public OnlinePlayer(){
        this.songDuration = null;
        this.songTitle = null;
        this.songArtist = null;
    }

    public OnlinePlayer(String songTitle, String songArtist, String songDuration) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songDuration = songDuration;
    }

    public void updateSong (String songTitle, String songArtist, String songDuration) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songDuration = songDuration;
    }

    @Override
    public void update(Player myPlayer) {
        if (this.myObservable != null) {
            this.songArtist = myPlayer.getSongArtist();
            this.songDuration = myPlayer.getSongDuration();
            this.songTitle = myPlayer.getSongTitle();
        }
        else
            System.out.println("Status notupdated!");
    }
}
