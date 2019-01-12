package Patterns.AbstractFactory;

import DAO.PersonDAO;

public abstract class AbstractFactory {
    abstract PersonDAO getWarrior(String warriorName);
    /**/
}