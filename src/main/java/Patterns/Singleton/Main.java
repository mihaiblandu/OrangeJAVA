package Patterns.Singleton;

public class Main {


    public static void main(String[] args) {

        AllyCommanderSingleton allyCommanderSingleton = AllyCommanderSingleton.getInstance();
        System.out.println("Ally Commander   " + allyCommanderSingleton.getAllyCommander().getName());


        EnemyCommanderSingleton enemyCommanderSingleton =EnemyCommanderSingleton.getInstance();
        System.out.println("Enemy Commander   " + enemyCommanderSingleton.getAllyCommander().getName());

    }
}
