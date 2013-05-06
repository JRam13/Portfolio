package portfolio;


public class Stocks extends Account{
	double stockValue;
	String accountName;
	
	public Stocks(String newAccountName, double newStockValue) {
		
		accountName = newAccountName;
		stockValue = newStockValue;
		
	}

	@Override
	public void displayAccountInfo() {
		
		System.out.println(getAccountName() + "- $" +getAccountValue());
	}
	
	public double getAccountValue(){
		return stockValue;
	}

	@Override
	public String getAccountName() {
		return accountName;
	}
	
	public void acceptValuationVisitor(PricingVisitor visitor) {
		visitor.visitStock(this);	
	}

}
