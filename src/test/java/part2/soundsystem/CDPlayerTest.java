package part2.soundsystem;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import part2.soundsystem.configurations.CDPlayerConfig;
import part2.soundsystem.interfaces.CompactDisk;
import part2.soundsystem.interfaces.MediaPlayer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisk cd;


    @Test
    public void cdShouldNotBeNull() throws Exception {
        assertNotNull(cd);
    }

    @Test
    public void shouldPlay() throws Exception {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", log.getLog());
    }

    /*
        @SpringJUnit4ClassRunner
        Will instantiate the application Spring Application context

        @ContextConfiguration
        Register the java configuration files into the context

        @Autowired
        Will inject the bean into the test. Note that in the configuration je just enabled bean scan.
        This will find the CompactDiskInterface automatically and since it hast just one implementation, it will know that it is actually a SgtPeppers cd.
    */

}