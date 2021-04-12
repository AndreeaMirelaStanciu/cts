package ro.ase.csie.g1087.cc.tema2;

public class Imprumut implements InterfataImprumut {
	int zileActiv;
	double valoareImprumut, rata;

	public Imprumut(int zileActiv, double valoareImprumut, double rata) throws ValoareInvalidaException {
		this.zileActiv = zileActiv;
		verificaValoare(valoareImprumut);
		this.valoareImprumut = valoareImprumut;
		this.rata = rata;
	}
	
	public double getRataLunara() {
		return (valoareImprumut * this.rata)/12;
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
	
	public double calculeazaDobandaPrincipala() {
		return this.valoareImprumut - this.valoareImprumut * Math.pow(this.rata, (this.zileActiv / 365));
	}
}
