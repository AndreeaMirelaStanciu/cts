package stanciu.andreea.mirela.g1087;

import stanciu.andreea.mirela.g1087.singleton.ContAdministrator;
import stanciu.andreea.mirela.g1087.singleton.ExceptieCreareAdministrator;
import stanciu.andreea.mirela.g1087.singleton.ModulGestiune;
import stanciu.andreea.mirela.g1087.singleton.ModulProfil;

public class TestAssignment {

	public static void main(String[] args) {
		
		//Singleton
		try {
			ContAdministrator administrator1 = ContAdministrator.getAdministrator();
			ContAdministrator administrator2 = ContAdministrator.getAdministrator();
			
			System.out.println(administrator1);
			System.out.println(administrator2);
			
			ModulGestiune modulGestiune = new ModulGestiune();
			ModulProfil modulProfil = new ModulProfil();
			
			ContAdministrator jucator3 = ContAdministrator.getAdministrator("altAdmin@gmail.com", "123456");

		} catch (ExceptieCreareAdministrator e) {
			System.out.println("S-a incercat crearea unui administrator diferit!");
		}
	}

}
