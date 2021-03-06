package ro.ase.csie.cts.dp.singleton.g1088;

public class TestSingleton {

	public static void main(String[] args) {
		ConexiuneBD conexiune1 = ConexiuneBD.getConexiune();
		ConexiuneBD conexiune2 = ConexiuneBD.getConexiune();
		
		if(conexiune1 == conexiune2) {
			System.out.println("Cele 2 referinte sunt identice");
		} else {
			System.out.println("Cele 2 referinte sunt diferite");
		}
		
		ModulUI modulUI = new ModulUI();
		ModulProfil modulProfil = new ModulProfil();
	}

}
