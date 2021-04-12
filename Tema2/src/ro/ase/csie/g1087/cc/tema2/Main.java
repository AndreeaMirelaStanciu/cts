package ro.ase.csie.g1087.cc.tema2;

public class Main {

	public static void main(String[] args) {
		Imprumut imprumut = new Imprumut(100000,3);
		System.out.println(imprumut.getRataLunara());
		Imprumut imprumut2 = new Imprumut(900000,7);
		try {
			ContCredit contCredit = new ContCredit(1078, Account.SUPER_PREMIUM, imprumut);
			ContCredit contCredit2 = new ContCredit(3035, Account.PREMIUM, imprumut2);
			contCredit.print();
			contCredit2.print();
			ContCredit conturi[] = new ContCredit[2];
			conturi[0] = contCredit;
			conturi[1] = contCredit2;
			Broker broker = new Broker(.0125, conturi);
			System.out.println(broker.calculeazaComisionTotal());
		} catch (ValoareInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
