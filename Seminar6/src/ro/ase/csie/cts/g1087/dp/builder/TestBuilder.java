package ro.ase.csie.cts.g1087.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1. construiesti obiectul 
		SuperErou superErou = new SuperErou();
		//2. initializarea atributelor. aceasta este marea problema pt multe buguri ex baza de date inconsistenta
		superErou.nume = "Supername"; //nu este o varianta ok deoarece in viitor se vor uita atributele sa le initializeze
		
		SuperErou superErou2 = new SuperErou("Batman",100,false,false, new Arma(),null,null);

	}

}
