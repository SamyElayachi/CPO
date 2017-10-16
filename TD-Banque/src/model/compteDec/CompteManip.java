package model.comptedec;
import model.exceptions.InsufficientBalance;

public interface CompteManip extends Compte {
	double withdraw(double amount) throws InsufficientBalance;
}