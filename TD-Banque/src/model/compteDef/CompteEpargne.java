package model.comptedef;

/**
* Model a check account
*/

public final class CompteEpargne extends CompteImp {

	private final int minimumBalance;

	public CompteEpargne(String owner, double initialBalance){
		super(owner, initialBalance);
		this.minimumBalance = 50;
	}

	public CompteEpargne(String owner){
		super(owner);
		this.minimumBalance = 50;
	} 
	
	public int getMiniumumBalance() { return this.minimumBalance; }

	@Override
	public double withdraw(double amount){
		double previous = this.getBalance();
		if(previous - amount >= 50) {
			this.setBalance(previous - amount);
		}
		return this.getBalance();

	}

	@Override
	public double deposite(double amount){
		double previous = this.getBalance();
		this.setBalance(previous + amount);
		return this.getBalance();
	}
}