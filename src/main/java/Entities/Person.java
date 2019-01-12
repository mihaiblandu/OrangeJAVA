package Entities;

import DAO.PersonDAO;

/**
*
* @author Mihai Blandu
*/
public abstract class Person implements PersonDAO{

    private String		name;
    private int			health;
    private int			level;
    private int			experience;
    private Race		race;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
		this.race = race;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", health=" + health + ", level=" + level + ", experience=" + experience
				+ ", race=" + race + "]";
	}
	
	


}
