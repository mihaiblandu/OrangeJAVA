package Patterns.Utils;

import DAO.*;
import Entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Instances {
    private static   ApplicationContext context = new ClassPathXmlApplicationContext("ConfigBeans.XML");

    public static AllyCommander getAllyCommander()
    {
        CommanderDAO allyCommander = (CommanderDAO) context.getBean("allyCommander");
        return (AllyCommander) allyCommander;
    }

    public static EnemyCommander getEnemyCommander()
    {
        CommanderDAO enemyCommander = (CommanderDAO) context.getBean("enemyCommander");
        return (EnemyCommander) enemyCommander;
    }

    public static AllySoldier getAllySoldier()
    {
        SoldierDAO allySoldier = (SoldierDAO) context.getBean("allySoldier");
        return (AllySoldier) allySoldier;
    }

    public static EnemySoldier getEnemySoldier()
    {
        EnemySoldierDAO enemySoldier = (EnemySoldierDAO) context.getBean("enemySoldier");
        return (EnemySoldier) enemySoldier;
    }
    public static EnemyDragon getEnemyDragon()
    {
        DragonDAO enemyDragon = (DragonDAO) context.getBean("enemyDragon");
        return (EnemyDragon) enemyDragon;
    }
    public static AllyDragon getAllyDragon()
    {
        DragonDAO allyDragon = (DragonDAO) context.getBean("allyDragon");
        return (AllyDragon) allyDragon;
    }
    public static AllyMage getAllyMage()
    {
        MageDAO mage = (MageDAO) context.getBean("allyMage");
        return (AllyMage) mage;
    }
    public static EnemyWitch getEnemyWitch()
    {
        WitchDAO witch = (WitchDAO) context.getBean("enemyWitch");
        return (EnemyWitch) witch;
    }
}
