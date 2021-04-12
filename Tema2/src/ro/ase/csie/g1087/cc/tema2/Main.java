package ro.ase.csie.g1087.cc.tema2;

public class Main {

	public static void main(String[] args) {
		
		try {
			Imprumut imprumut = new Imprumut(3000, 100000, 0.5);
			System.out.println("Rata lunara a imprumutului este de " + imprumut.getRataLunara()); 
			Imprumut imprumut2 = new Imprumut(5000, 90000, 0.3);
			ContCredit contCredit = new ContCredit( Account.SUPER_PREMIUM, imprumut);
			ContCredit contCredit2 = new ContCredit( Account.PREMIUM, imprumut2);
			contCredit.print();
			contCredit2.print();
			ContCredit conturi[] = new ContCredit[2];
			conturi[0] = contCredit;
			conturi[1] = contCredit2;
			Broker broker = new Broker(.0125, conturi);
			System.out.println("Comisionul total al brokerului este de " + broker.calculeazaComisionTotal());
		} catch (ValoareInvalidaException e) {
			System.out.println(e.getMessage());
		}	
	}

}
