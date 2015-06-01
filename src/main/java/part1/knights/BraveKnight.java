package part1.knights;

import part1.quests.Quest;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(final Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
