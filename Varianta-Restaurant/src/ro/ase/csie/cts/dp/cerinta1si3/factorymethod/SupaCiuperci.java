package ro.ase.csie.cts.dp.cerinta1si3.factorymethod;

public class SupaCiuperci extends InterfataSupa{

	@Override
	public void adaugaIngredientSecret(String ingredient) {
		System.out.println("Adaugare " + ingredient + " in supa de ciuperci");
	}
}
