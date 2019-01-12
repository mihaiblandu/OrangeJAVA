package Patterns.Singleton;


import Entities.AllyCommander;
import Spring.JavaConfig.JavaBasedBeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AllyCommanderSingleton {

    private static AllyCommanderSingleton commander;

    private AllyCommanderSingleton() {

    }

    public static synchronized AllyCommanderSingleton getInstance() {
        if (commander == null) {

            commander= new AllyCommanderSingleton();
        }
        return commander;
    }


    public AllyCommander getAllyCommander() {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(JavaBasedBeansConfig.class);

        AllyCommander allyCommander = context.getBean(AllyCommander.class);

        return allyCommander;
    }
}
