package ro.ase.csie.g1087.dp.factorymethod;

import ro.ase.csie.g1087.dp.simplefactory.SuperErouAbstract;
import ro.ase.csie.g1087.dp.simplefactory.TipErou;

public abstract class FactoryAbstract {
	
	public abstract SuperErouAbstract getSuperErou(TipErou tip, String nume);
}
