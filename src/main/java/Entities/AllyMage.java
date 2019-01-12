package Entities;

import DAO.MageDAO;

/**
*
* @author Mihai Blandu
*/
public class AllyMage extends Person implements MageDAO{

	private  int mana;

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void castSpell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}


    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }
}
