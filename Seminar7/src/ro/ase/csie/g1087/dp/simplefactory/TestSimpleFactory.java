package ro.ase.csie.g1087.dp.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
//		SuperErouAbstract supererou =
//				new CaracterDisney("Mickey Mouse", 100, false);
//		supererou = new CaracterMarvel("Spiderman", 100, 50);	
//		supererou = new CaracterDCComics("Batman", 150);
		
		SuperErouAbstract superCaracter = 
				FactorySuperErou.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
		
		superCaracter = FactorySuperErou.getSuperErou(TipErou.MARVEL, "Spiderman");
		
		superCaracter = FactorySuperErou.getSuperErou(TipErou.DC, "Batman");
	}

	
}
