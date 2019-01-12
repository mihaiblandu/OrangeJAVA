package Spring.XMLConfig;

import DAO.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));

        ApplicationContext context = new ClassPathXmlApplicationContext("ConfigBeans.XML");

        CommanderDAO allyCommander = (CommanderDAO) context.getBean("allyCommander");
        System.out.println(allyCommander.toString());

        CommanderDAO enemyCommander = (CommanderDAO) context.getBean("enemyCommander");
        System.out.println(enemyCommander.toString());

        DragonDAO enemyDragon = (DragonDAO) context.getBean("enemyDragon");
        System.out.println(enemyDragon.toString());

        DragonDAO allyDragon = (DragonDAO) context.getBean("allyDragon");
        System.out.println(allyDragon.toString());

        AllySoldierDAO allySoldier = (AllySoldierDAO) context.getBean("allySoldier");
        System.out.println(allySoldier.toString());


        EnemySoldierDAO enemySoldier = (EnemySoldierDAO) context.getBean("enemySoldier");
        System.out.println(enemySoldier.toString());

        WitchDAO enemyWitch = (WitchDAO) context.getBean("enemyWitch");
        System.out.println(enemyWitch.toString());


        MageDAO allyMage = (MageDAO) context.getBean("allyMage");
        System.out.println(allyMage.toString());


    }
}
