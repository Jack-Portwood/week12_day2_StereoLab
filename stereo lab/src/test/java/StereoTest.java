import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    CDplayer cdplayer;
    RecordPlayer recordPlayer;

    @Before
    public void before() {
        radio = new Radio();
        cdplayer = new CDplayer(4, "Sony", "Soundman");
        recordPlayer = new RecordPlayer(33, "Sony", "Spinboy");
        stereo = new Stereo(radio, cdplayer, recordPlayer);

    }


    @Test
    public void canPlayCD(){
        stereo.playCD("Demolition Lovers");
        assertEquals("Demolition Lovers", stereo.getCDplayer().getTrack());
    }

    @Test
    public void canPlayRecord(){
        stereo.RecordPlayer("Sweet Caroline");
        assertEquals("Sweet Caroline", stereo.getRecordPlayer().getTrack());

    }

    @Test
    public void canTuneIn(){
        assertEquals("BBC Radio 4",stereo.getRadio().tuned());
    }

}