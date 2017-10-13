package model.compteDef;

import model.compteDec.CompteManip;

/**
* Model a check account
*/

public final class CompteCourant extends CompteImp {
	
	private int overdraft; //découvert

	public CompteCourant(String owner, double initialBalance, int overdraft){
		super(owner, initialBalance);
		this.overdraft = overdraft;
	}
	
	public CompteCourant(String owner, double initialBalance){
		super(owner, initialBalance);
		this.overdraft = 0;
	}

	public CompteCourant(String owner, int overdraft){
		super(owner);
		this.overdraft = overdraft;
	} 
	
	public CompteCourant(String owner){
		super(owner);
		this.overdraft = 0;
	} 
	
	public int getOverdraft() { return this.overdraft; }
	
	public void setOverdraft(int newOverdraft) { this.overdraft = newOverdraft; }

	@Override
	public double withdraw(double amount){
		double previous = this.getBalance();
		if(previous - amount > 0 - this.overdraft) {
			this.setBalance(previous - amount);
		}
		return this.getBalance();
	}

	@Override
	public double deposit(double amount){
		double previous = this.getBalance();
		this.setBalance(previous + amount);
		return this.getBalance();
	}
}