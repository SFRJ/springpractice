package part2.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import part2.soundsystem.interfaces.CompactDisk;
import part2.soundsystem.interfaces.MediaPlayer;

/*
This class is an example of Setter injection
The rule is to use constructor injection for hard dependencies, setter injection for soft dependencies.
*/
public class BlueRayPlayer implements MediaPlayer {

    private CompactDisk compactDisk;

    @Autowired
    public void setCompactDisk(final CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }

    @Override
    public void play() {
        compactDisk.play();
    }
}
