package ro.ase.csie.g1087.cc.tema2;

public class CalculatorComisionPremium implements InterfataComision{

	double procentTaxa;
	
	public CalculatorComisionPremium(double procentTaxa) {
		this.procentTaxa = procentTaxa;
	}

	@Override
	public double calculeazaComisionTotal(ContCredit[] conturi) {
		double comisionTotal = 0.0;		
		for (ContCredit cont : conturi) {
			if (cont.tipCont == Account.PREMIUM || cont.tipCont == Account.SUPER_PREMIUM)
				comisionTotal += calculeazaTaxaBroker(cont.imprumut.calculeazaDobandaPrincipala());	
		}
		return comisionTotal;
	}
	
	public double calculeazaTaxaBroker(double dobandaPrincipala) {
		return this.procentTaxa * dobandaPrincipala;
	}

}
