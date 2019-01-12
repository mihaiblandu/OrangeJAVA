package Entities;

import DAO.WitchDAO;

/**
*
* @author Mihai Blandu
*/
public class EnemyWitch extends Person implements WitchDAO{

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	private int mana;

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void castSpell() {
		// TODO Auto-generated method stub
		
	}

}
