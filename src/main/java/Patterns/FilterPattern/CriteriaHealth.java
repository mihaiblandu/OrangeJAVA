package Patterns.FilterPattern;

import DAO.PersonDAO;

import java.util.ArrayList;
import java.util.List;

public class CriteriaHealth implements Criteria {

    @Override
    public List <PersonDAO> meetCriteria(List <PersonDAO> persons) {
        List<PersonDAO> sick = new ArrayList<PersonDAO>();

        for (PersonDAO person : persons) {
            if(person.getHealth() < 60){
                sick.add(person);
            }
        }
        return sick;
    }
}
