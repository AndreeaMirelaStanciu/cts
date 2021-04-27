package ro.ase.csie.cts.dp.decorator.buton;

public class Buton extends AbstractControlVizual {
	public Buton(String text, int id) {
		this.text = text;
		this.id = id;
	}
	
	@Override
	public void click() {
		System.out.println("Click simplu pe buton " + text);
	}
}
