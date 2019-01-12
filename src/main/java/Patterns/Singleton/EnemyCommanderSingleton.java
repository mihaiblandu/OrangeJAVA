package Patterns.Singleton;

import Entities.EnemyCommander;
import Spring.JavaConfig.JavaBasedBeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnemyCommanderSingleton {



    private static EnemyCommanderSingleton commander;

    private EnemyCommanderSingleton() {

    }

    public static synchronized EnemyCommanderSingleton getInstance() {
        if (commander == null) {
            commander= new EnemyCommanderSingleton();
        }
        return commander;
    }


    public EnemyCommander getAllyCommander() {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(JavaBasedBeansConfig.class);

        EnemyCommander enemyCommander = context.getBean(EnemyCommander.class);
        return enemyCommander;
    }
}

