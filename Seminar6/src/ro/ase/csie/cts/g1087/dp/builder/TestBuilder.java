package ro.ase.csie.cts.g1087.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1. construiesti obiectul 
		SuperErou superErou = new SuperErou();
		//2. initializarea atributelor. aceasta este marea problema pt multe buguri ex baza de date inconsistenta
		superErou.nume = "Supername"; //nu este o varianta ok deoarece in viitor programatorii vor uita sa initializeze atributele
		
		SuperErou superErou2 = new SuperErou("Batman",100,false,false, new Arma(),null,null);
		//nu mai permitem crearea de obiecte cu valori implicite, insa problema e ca e greu de modificat si inteles codul
		
		//solutia consta in BUILDER, ne uitam pe diagrama uml 

	}

}
