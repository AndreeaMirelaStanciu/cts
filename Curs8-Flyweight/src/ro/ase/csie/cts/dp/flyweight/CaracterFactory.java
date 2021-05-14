package ro.ase.csie.cts.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

//Flyweight factory
public class CaracterFactory {
	private Map<String, Client> caractere = new HashMap<String, Client>();

	public Client getCaracter(String valoareCaracter) {
		Client caracter = caractere.get(valoareCaracter);
		if (caracter == null) {
			caracter = new Client(valoareCaracter);
			caractere.put(valoareCaracter, caracter);
		}
		return caracter;
	}

	public int getNrCaractere() {
		return caractere.size();
	}
}
