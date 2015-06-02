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
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    /*
    This is also another alternative to above, when you want to create beans with dependencies
        @Bean
        public Knight knight(Quest quest) {
            return new BraveKnight(quest);
        }
     The advantage of this code over the other code, is that the Quest bean does not have to be
     prepared in this configuration class. If configurations are splitted, you can import it into each other when necessary using @Import(DependencyClass.class)
    */

}
