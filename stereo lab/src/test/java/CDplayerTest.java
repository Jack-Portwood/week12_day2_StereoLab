import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDplayerTest {

    CDplayer cdplayer;

    @Before

    public void before() {
        cdplayer = new CDplayer(4, "Sony", "Soundman");
    }

    @Test
    public void canPlay(){
       cdplayer.play("Vampires Will Never Hurt You");
        assertEquals("Vampires Will Never Hurt You", cdplayer.getTrack());
    }

}
