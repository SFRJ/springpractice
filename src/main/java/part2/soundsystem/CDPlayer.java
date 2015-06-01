package part2.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisk compactDisk;

    @Autowired
    public CDPlayer(final CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }

    @Override
    public void play() {
        compactDisk.play();
    }
}

/*
You can also use setter injection

    @Autowired
    public void setCompactDisc(CompactDisc compactDisk) {
        this.compactDisk = compactDisk;
    }



Note: If you see around @Inject annotation, that is just the same as @Autowired, does exactly the same and in many cases is interchangeable(doesn't matter which one you use)
*/
