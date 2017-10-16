package main;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.IOException;
import java.util.logging.*;

import model.comptedec.Compte;
import model.comptedec.CompteManip;
import model.comptefactory.CompteFactory;
import model.exceptions.InsufficientBalance;

public final class Main {

	private static final Logger LOG = Logger.getLogger(Main.class.getCanonicalName());

	public static void main(String[] args){
		try{
			Handler handler = new FileHandler("bank.log", true);
			handler.setLevel(Level.FINE);
			LOG.addHandler(handler);
		}catch(IOException ioe) {
			LOG.warning("Fichier introuvable !");
		}

		
		

		CompteFactory cf = new CompteFactory();

		//Compte c1 = new CompteCourant("John Doe", 1500.0d);
		//CompteManip c1 = cf.creerCompteCourant("John Doe", 1500.0d);
		CompteManip c1 = cf.creerCompteCourant("John Doe");
		//Compte c2 = new CompteCourant("Jack Baueur");
		CompteManip c2 = cf.creerCompteCourant("Jack John");

		c1.deposit(1500.0d);
		double amount = 1900.0d;
		try{
			double retrait = c1.withdraw(amount);
		}
		catch (InsufficientBalance ex){
			LOG.severe(ex.getMessage());

		} finally{ 
			LOG.fine("Withdraw operation of " + amount);
		}
		
		double nouveauSolde = c2.deposit(100000.0d);
 
		LOG.info(c1.toString());
		System.out.println(c2.toString());

	}
}