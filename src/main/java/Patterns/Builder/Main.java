package Patterns.Builder;

import Patterns.Utils.Instances;

public class Main {
    public static void main(String[] args) {

            Cohort cohortAlly = new CohortBuilder().getAllyCohort(Instances.getAllySoldier());
        cohortAlly.showMembers();


        Cohort cohortEnemy = new CohortBuilder().getEnemyCohort(Instances.getEnemySoldier());
        cohortEnemy.showMembers();


    }
}
