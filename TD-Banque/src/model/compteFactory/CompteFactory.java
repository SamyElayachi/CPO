package model.compteFactory;

import model.compteDec.*;
import model.compteDef.*;

public final class CompteFactory{

	public Compte creeCompteCourant(String owner){
		return new CompteCourant(owner);
	}

}