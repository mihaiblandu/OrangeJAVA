package Patterns.Builder;

import DAO.PersonDAO;
import DAO.SoldierDAO;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    public Cohort(SoldierDAO type){
        createCohort(type);
    }

    private List <PersonDAO> cohort = new ArrayList <PersonDAO>();

    public void addRecrute(SoldierDAO recrute){
        cohort.add(recrute);
    }

    public void addAuxiliares(PersonDAO aux){
        cohort.add(aux);
    }

    public void createCohort(SoldierDAO recrute)
    {
        int i = 0;

        while (++i < 20) {
            this.addRecrute(recrute);
        }
    }
    public void showMembers(){

        for (PersonDAO member : this.cohort) {
            System.out.println(member.toString());
        }
    }

}
