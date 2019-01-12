package Entities;

import DAO.CommanderDAO;

/**
*
* @author Mihai Blandu
*/
public class AllyCommander extends Person implements CommanderDAO  {



	@Override
	public void attack() {
		System.out.println("Comander Atack");
	}

	@Override
	public void promote() {
		System.out.println("Comander Promote");
		
	}

	@Override
	public void sendOrders() {
		System.out.println("Comander send Orders");
	}

}
