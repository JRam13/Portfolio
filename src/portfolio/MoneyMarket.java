package portfolio;


public class MoneyMarket extends Account{
	double moneyMarketValue;
	String accountName;
	
	public MoneyMarket(String newAccountName, double newMoneyMarketValue) {
		
		accountName = newAccountName;
		moneyMarketValue = newMoneyMarketValue;
		
	}

	@Override
	public void displayAccountInfo() {
		
		System.out.println(getAccountName() + "- $" +getAccountValue() + "\n");
	}
	
	public double getAccountValue(){
		return moneyMarketValue;
	}

	@Override
	public String getAccountName() {
		return accountName;
	}
	
	public void acceptValuationVisitor(PricingVisitor vistior) {
		vistior.visitMoneyMarket(this);
	}
	

}
