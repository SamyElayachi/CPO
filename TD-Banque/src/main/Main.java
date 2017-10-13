package main;

import model.compteFactory.CompteFactory;
import model.compteDec.CompteManip;
import model.compteDec.Compte;


public final class Main {

	public static void main(String[] args){

		CompteFactory cf = new CompteFactory();
		Compte c1 = cf.creeCompteCourant("Francis");
		c1.deposit(10000.0d);
	}
}