package stanciu.andreea.mirela.g1087;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import stanciu.andreea.mirela.g1087.builder.BuilderAbstractCursant;
import stanciu.andreea.mirela.g1087.builder.BuilderCursant;
import stanciu.andreea.mirela.g1087.builder.ConfiguratorCursant;
import stanciu.andreea.mirela.g1087.builder.Cursant;
import stanciu.andreea.mirela.g1087.builder.module.HobbySah;
import stanciu.andreea.mirela.g1087.builder.module.InvestitieCrypto;
import stanciu.andreea.mirela.g1087.factorymethod.FactoryAbstract;
import stanciu.andreea.mirela.g1087.factorymethod.FactoryModInvatare1;
import stanciu.andreea.mirela.g1087.factorymethod.FactoryModInvatare2;
import stanciu.andreea.mirela.g1087.factorymethod.LectieAbstracta;
import stanciu.andreea.mirela.g1087.factorymethod.TipLectie;
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
		
		//Builder 
		Date simpleDateFormat1 = null;
		Date simpleDateFormat2 = null;
		try {
			simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy").parse("03/04/1995");
			simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy").parse("24/08/1999");
			
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		
		BuilderCursant builder = 
				new BuilderCursant("Popescu Ion", simpleDateFormat1, "0723648732",false);
		builder.adaugaAdresaContact("popescuion@gmail.com");
		builder.adaugaObiectivFinanciar(new InvestitieCrypto(50));
		builder.adaugaHobby(new HobbySah(5));
		Cursant cursant1 = builder.getCursant();
		
		ConfiguratorCursant configurator = 
				new ConfiguratorCursant(new BuilderCursant("Ionescu Maria", simpleDateFormat2, "0757727345",true));
		configurator.construieste();
		Cursant cursant2 = configurator.getCursant();
		
		//Factory method
		boolean esteModulDeInvatare1 = true;
		
		FactoryAbstract factoryLectii = null;
		
		if(esteModulDeInvatare1) {
			factoryLectii = new FactoryModInvatare1();
		} else {
			factoryLectii = new FactoryModInvatare2();
		}

		LectieAbstracta lectie = factoryLectii.getLectie(TipLectie.TEXT, "Lectie invetsitii", "Imobiliare");
	}

}
