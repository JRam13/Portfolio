package portfolio;

public abstract class Account extends PortfolioComponent{
	
	public void add(PortfolioComponent newPortfolioComponent){
		
		throw new UnsupportedOperationException();
		
	}
	
	public void remove(PortfolioComponent newPortfolioComponent){
		
		throw new UnsupportedOperationException();
		
	}

	public abstract String getAccountName();
	
	public abstract void displayAccountInfo();
	
}
