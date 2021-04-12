package ro.ase.csie.g1087.cc.tema2;

public class ContCredit {

	int zileActiv;
	Account tipCont;
	Imprumut imprumut;


	public ContCredit(int zileActiv, Account tipCont, Imprumut imprumut) throws ValoareInvalidaException {
		this.imprumut = imprumut;
		this.tipCont = tipCont;
		this.zileActiv = zileActiv;
	}
	
	public String toString() {
		return "Loan: " + this.imprumut.valoareImprumut + "; rate: " + this.imprumut.rata + "; days active:"
				+ this.zileActiv + "; Type: " + this.tipCont + ";";
	}

	public void print() {
		System.out.println("This is an account");
	}
}
