package Spring.JavaConfig;


/*
* */

import Entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaBasedBeansConfig {

    @Bean
    public AllyCommander allyCommander() {
        AllyCommander commander = new AllyCommander();
        commander.setName("Guilliman");
        commander.setHealth(100);
        commander.setLevel(1);
        commander.setExperience(0);
        return commander;
    }

    @Bean
    public EnemyCommander enemyCommander() {
        EnemyCommander commander = new EnemyCommander();
        commander.setName("Abandon");
        commander.setHealth(100);
        commander.setLevel(1);
        commander.setExperience(0);
        return commander;
    }

    @Bean
    public AllySoldier allySoldier() {
        AllySoldier  soldier  = new AllySoldier();
        soldier.setName("Private");
        soldier.setHealth(100);
        soldier.setLevel(1);
        soldier.setExperience(0);
        return soldier;
    }

    @Bean
    public EnemySoldier enemyEnemy() {
        EnemySoldier  soldier  = new EnemySoldier();
        soldier.setName("Private");
        soldier.setHealth(100);
        soldier.setLevel(1);
        soldier.setExperience(0);
        return soldier;
    }

    @Bean
    public AllyMage allyMage() {
        AllyMage  allyMage  = new AllyMage();
        allyMage.setName("Private");
        allyMage.setHealth(100);
        allyMage.setLevel(1);
        allyMage.setExperience(0);
        allyMage.setMana(100);
        return allyMage;
    }

    @Bean
    public EnemyWitch enemyWitch() {
        EnemyWitch  enemyWitch  = new EnemyWitch();
        enemyWitch.setName("Private");
        enemyWitch.setHealth(100);
        enemyWitch.setLevel(1);
        enemyWitch.setExperience(0);
        enemyWitch.setMana(100);
        return enemyWitch;
    }

    @Bean
    public AllyDragon allyDragon() {
        AllyDragon  dragon  = new AllyDragon();
        dragon.setName("Ally Dragon");
        dragon.setHealth(1000);
        dragon.setLevel(1);
        dragon.setExperience(0);
        return dragon;
    }

    @Bean
    public EnemyDragon enemyDragon() {
        EnemyDragon  dragon  = new EnemyDragon();
        dragon.setName("Ally Dragon");
        dragon.setHealth(1000);
        dragon.setLevel(1);
        dragon.setExperience(0);
        return dragon;
    }


}
