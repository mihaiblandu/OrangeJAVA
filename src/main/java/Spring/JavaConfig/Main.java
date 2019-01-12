package Spring.JavaConfig;

import Entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Java base Config

        ApplicationContext context
                = new AnnotationConfigApplicationContext(JavaBasedBeansConfig.class);

        AllyCommander allyCommander = context.getBean(AllyCommander.class);
        System.out.println(allyCommander.toString());



        EnemyCommander enemyCommander = context.getBean(EnemyCommander.class);
        System.out.println(enemyCommander.toString());


        EnemyDragon enemyDragon = context.getBean(EnemyDragon.class);
        System.out.println(enemyDragon.toString());

        EnemySoldier enemySoldier = context.getBean(EnemySoldier.class);
        System.out.println(enemySoldier.toString());

        EnemyWitch enemyWitch = context.getBean(EnemyWitch.class);
        System.out.println(enemyWitch.toString());

    }
}
