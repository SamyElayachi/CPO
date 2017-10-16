package model.comptedec;

public interface Compte {
	String getOwner();
	String getNum();
	double getBalance();
	void setBalance(double newBalance);
	double deposit(double amount);
}