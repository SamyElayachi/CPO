package model.comptefactory;

import model.comptedec.Compte;
import model.comptedec.CompteManip;
import model.comptedef.CompteCourant;

public final class CompteFactory {

	//Creation de comptes
	/*public Compte creerCompte(String owner, double initialBalance) {
		return new Compte(owner,initialBalance);
	}

	public Compte creerCompte(String owner) {
		return new Compte(owner);
	}*/

	//Creation de comptes courants
	/*public CompteManip creerCompteCourant(String owner, double initialBalance, int overdraft) {
		return new CompteCourant(owner,initialBalance,overdraft);
	}

	public CompteManip creerCompteCourant(String owner, double initialBalance) {
		return new CompteCourant(owner,initialBalance);
	}

	public CompteManip creerCompteCourant(String owner,int overdraft) {
		return new CompteCourant(owner,overdraft);
	}*/

	public CompteManip creerCompteCourant(String owner) {
		return new CompteCourant(owner);
	}
/*
	//Creation de comptes épargne
	public CompteEpargne creerCompteEpargne(String owner,double initialBalance) {
		return new CompteEpargne(owner, initialBalance);
	}

	public CompteEpargne creerCompteEpargne(String owner) {
		return new CompteEpargne(owner);
	}

	//Création de comptes assurance vie
	public CompteEpargne creerAssuranceVie(String owner,double initialBalance) {
		return new AssuranceVie(owner, initialBalance);
	}

	public CompteEpargne creerAssuranceVie(String owner) {
		return new AssuranceVie(owner);
	}*/
}