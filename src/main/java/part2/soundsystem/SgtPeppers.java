package part2.soundsystem;

import org.springframework.stereotype.Component;

/*
If we want to add an identifier to the bean you can add it to the @Component annotation.
Note: If you see the @Named annotation, it is just an alternative to @Component, it does exactly the same
*/

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisk {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }
}
