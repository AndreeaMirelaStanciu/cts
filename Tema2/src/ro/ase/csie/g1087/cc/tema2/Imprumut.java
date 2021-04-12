package ro.ase.csie.g1087.cc.tema2;

public class Imprumut implements InterfataImprumut {
	double valoareImprumut, rata;
	protected NotificationService notificationService;

	public Imprumut(double valoareImprumut, double rata) {
		super();
		this.valoareImprumut = valoareImprumut;
		this.rata = rata;
	}
	
	public double getRataLunara() {
		return valoareImprumut * this.rata;
	}

	public double getValoareImprumut() {	
		return valoareImprumut;
	}

	public double getRata() {
		return this.rata;
	}

	public void verificaValoare(double valoare) throws ValoareInvalidaException {
		if (valoare < 0) {
			throw new ValoareInvalidaException("Valoarea imprumutului nu poate fi negativa");
		}
	}

	public void setValoare(double valoare) throws ValoareInvalidaException {
		verificaValoare(valoare);
		valoareImprumut = valoare;
	}
}
