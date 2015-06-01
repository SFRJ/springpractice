package part1;

import part1.configurations.KnightConfiguration;
import part1.knights.BraveKnight;
import part1.knights.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part1.quests.Quest;
import part1.quests.SlayDragonQuest;
/*
Part 1 shows:
- How to perform Constructor injection without Spring
- How to use Spring xml files
- How to use Spring without xml files(Annotations)
- How to create Aspects in Spring xml configuration
*/
public class Part1Main {

    public static void main (String args[]) {
        /*
        * The act of creating associations between application components is commonly
        * referred to as wiring.
        */

        //Common wiring without using Spring
        Quest quest = new SlayDragonQuest(System.out);
        Knight knightA = new BraveKnight(quest);
        knightA.embarkOnQuest();

        //Wiring using an Spring xml configuration
        ClassPathXmlApplicationContext contextFromXml = new ClassPathXmlApplicationContext("part1config.xml");
        Knight knightB = contextFromXml.getBean(Knight.class);
        contextFromXml.close(); //Note you can safely close the context once the beans are loaded
        knightB.embarkOnQuest();

        //Wiring using Spring annotation configuration(without xml)
        AnnotationConfigApplicationContext contextFromAnnotation = new AnnotationConfigApplicationContext(KnightConfiguration.class);
        Knight knightC = contextFromAnnotation.getBean(Knight.class);
        contextFromAnnotation.close(); //Note you can safely close the context once the beans are loaded
        knightC.embarkOnQuest();
    }

}
