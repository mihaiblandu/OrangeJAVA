
package Patterns.Builder;

import DAO.SoldierDAO;
import Patterns.Utils.Instances;

public class CohortBuilder {

    public  Cohort getAllyCohort(SoldierDAO type)
    {
       Cohort cohort =  new Cohort(type);
       //In case when we whant to add auxiliaria
       cohort.addAuxiliares(Instances.getAllyMage());
       cohort.addAuxiliares(Instances.getAllyDragon());
        return cohort;
    }
    public  Cohort getEnemyCohort(SoldierDAO type)
    {
        Cohort cohort =  new Cohort(type);
        //In case when we whant to add auxiliaria
        cohort.addAuxiliares(Instances.getEnemyWitch());
        cohort.addAuxiliares(Instances.getEnemyDragon());
        return cohort;
    }

}
