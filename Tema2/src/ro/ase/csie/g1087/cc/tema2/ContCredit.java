package ro.ase.csie.g1087.cc.tema2;

public class ContCredit {

	Account tipCont;
	Imprumut imprumut;

	public ContCredit(Account tipCont, Imprumut imprumut) {
		this.imprumut = imprumut;
		this.tipCont = tipCont;
	}
	
	public String toString() {
		return "Loan: " + this.imprumut.valoareImprumut + "; rate: " + this.imprumut.rata + "; days active:"
				+ this.imprumut.zileActiv + "; Type: " + this.tipCont + ";";
	}

	public void print() {
		System.out.println("This is an account");
	}
}
