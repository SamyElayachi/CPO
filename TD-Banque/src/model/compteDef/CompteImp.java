package model.compteDef;

import java.util.UUID;
import java.lang.StringBuilder;
import model.compteDec.Compte;
/**
* Model the concept of back
*/
public abstract class CompteImp implements Compte{
	
	private final String owner;
	private final String num;
	private double balance;

	public CompteImp(String owner,double initialBalance){
		this.owner = owner;
		this.balance = initialBalance;
		this.num = UUID.randomUUID().toString();
	}

	public CompteImp(String owner) {
		this(owner, 0.0d);
	}

	public String getOwner(){return this.owner; }
	public String getNum(){return this.num; }
	public double getBalance(){return this.balance; }

	public void setBalance(double newBalance) {this.balance = newBalance; }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); // pour concataner chaines de caractere
		sb.append("{Compte ").append(num).append("\n")
		  .append("Owner: ").append(owner).append("\n")
		  .append("Balance: ").append(balance).append("\n");

		return sb.toString();
	}

	@Override
	public boolean equals(Object other){
		if (other == null) return false;
		if (!other.getClass().getCanonicalName().equals(this.getClass().getCanonicalName())) //Chemin classe
			return false;
		CompteImp c = (CompteImp)other;
		return this.num.equals(c.num) && this.owner.equals(c.owner);
	}
	
	public abstract double withdraw(double amount);

	public abstract double deposit(double amount);



}