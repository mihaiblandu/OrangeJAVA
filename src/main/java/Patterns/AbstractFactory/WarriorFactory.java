package Patterns.AbstractFactory;

import DAO.PersonDAO;
import Entities.AllySoldier;
import Entities.EnemySoldier;

public class WarriorFactory extends AbstractFactory {

    @Override
    PersonDAO getWarrior(String warriorName) {
        if(warriorName == null){
            return null;
        }

        if(warriorName.equalsIgnoreCase("allySoldier")){
            return new AllySoldier();

        }else if(warriorName.equalsIgnoreCase("enemySoldier")){
            return new EnemySoldier();
        }

        return null;
    }
}
