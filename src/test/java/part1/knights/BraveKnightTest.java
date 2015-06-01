package part1.knights;


import org.junit.Test;
import part1.quests.Quest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() throws Exception {
        Quest quest = mock(Quest.class);
        Knight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
        verify(quest,times(1)).embark();
    }
}