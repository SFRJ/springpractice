package part1.configurations;

import part1.knights.BraveKnight;
import part1.knights.Knight;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import part1.quests.Quest;
import part1.quests.SlayDragonQuest;

@Configuration
public class KnightConfiguration {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
