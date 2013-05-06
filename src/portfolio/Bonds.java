package portfolio;

public class Bonds extends Account{
	double bondValue;
	String accountName;
	
	public Bonds(String newAccountName, double newBondValue) {
		
		accountName = newAccountName;
		bondValue = newBondValue;
		
	}

	@Override
	public void displayAccountInfo() {
		
		System.out.println(getAccountName() + "- $" +getAccountValue());
	}
	
	public double getAccountValue(){
		return bondValue;
	}

	@Override
	public String getAccountName() {
		return accountName;
	}
	
	public void acceptValuationVisitor(PricingVisitor visitor) {
		visitor.visitBond(this);
	}
	
	

}