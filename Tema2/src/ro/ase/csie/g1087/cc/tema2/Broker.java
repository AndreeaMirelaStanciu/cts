package ro.ase.csie.g1087.cc.tema2;

public class Broker {
	double procentTaxa;
	ContCredit[] conturi;
	
	public Broker(double procentTaxa, ContCredit[] conturi) {
		this.procentTaxa = procentTaxa;
		this.conturi = conturi;
	}

	public double calculeazaTaxaBroker(double dobandaPrincipala) {
		return this.procentTaxa * dobandaPrincipala;
	}
	
	public double calculeazaComisionTotal() {
		double comisionTotal = 0.0;		
		for (ContCredit cont : conturi) {
			if (cont.tipCont == Account.PREMIUM || cont.tipCont == Account.SUPER_PREMIUM)
				comisionTotal += calculeazaTaxaBroker(cont.imprumut.calculeazaDobandaPrincipala());	
		}
		return comisionTotal;
	}
}
