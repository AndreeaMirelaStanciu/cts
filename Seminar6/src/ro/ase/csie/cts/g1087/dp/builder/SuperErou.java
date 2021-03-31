package ro.ase.csie.cts.g1087.dp.builder;

public class SuperErou {

	//definim contextul, adica atributele, pt a intelege dc e nev de builder
	String nume;
	int puncteViata;
	
	boolean esteNegativ;
	boolean esteRanitGrav;
	
	InterfataArma armaStanga;//pt a respecta d din solid folosim interfete, eliminand relatiile has a cu alte clase
	InterfataArma armaDreapta;
	InterfataSuperPutere superSuperPutere;
	
	//problemele pe care le rezolva builderul:
	public SuperErou() {
		
	}

	public SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
			InterfataArma armaDreapta, InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superSuperPutere = superSuperPutere;
	}
	
	
}
