package part1.aspects;

import java.io.PrintStream;

/*
This class is just an annalogy of a Logger or any other service that should be used as Cross Cutting concerns.
We want to log Knights adventures, but makes no sense the Minstrel to be owned by the Knight, so we resort to part1.aspects.
*/
public class Minstrel {

    private PrintStream printStream;

    public Minstrel(final PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest() {
        printStream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        printStream.println("Tee hee hee, the brave knight did embark on a quest!");
    }
}
