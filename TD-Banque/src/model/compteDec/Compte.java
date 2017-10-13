package model.compteDec;


public interface Compte {

	public String getOwner();
	public String getNum();
	public double getBalance();
	public void setBalance(double newBalance);
	public abstract double deposit(double amount);


}