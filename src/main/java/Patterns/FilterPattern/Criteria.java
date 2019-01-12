package Patterns.FilterPattern;

import DAO.PersonDAO;

import java.util.List;

public interface Criteria {
        public List <PersonDAO> meetCriteria(List<PersonDAO> persons);
    }

