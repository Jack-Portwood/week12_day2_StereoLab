public class Stereo {

    private Radio radio;
    private CDplayer cdplayer;
    private RecordPlayer recordPlayer;

    public Stereo(Radio radio, CDplayer cdplayer, RecordPlayer recordPlayer) {
        this.radio = radio;
        this.cdplayer = cdplayer;
        this.recordPlayer = recordPlayer;
    }

    public void playCD( String track){
        this.cdplayer.play(track);
    }

    public void RecordPlayer( String track){
        this.recordPlayer.play(track);
    }

    public void radio(){
        this.radio.tuned();
    }

    public Radio getRadio() {
        return radio;
    }

    public CDplayer getCDplayer() {
        return cdplayer;
    }

    public RecordPlayer getRecordPlayer() {
        return recordPlayer;
    }
}
