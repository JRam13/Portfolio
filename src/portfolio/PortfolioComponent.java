package portfolio;

public abstract class PortfolioComponent {
	
	public void add(PortfolioComponent newPortfolioComponent){
		
		throw new UnsupportedOperationException();
		
	}
	
	public void remove(PortfolioComponent newPortfolioComponent){
		
		throw new UnsupportedOperationException();
		
	}
	
	public void displayAccountInfo(){
		
		throw new UnsupportedOperationException();
		
	}
	
	public double getAccountValue(){
		
		throw new UnsupportedOperationException();

	}
	
	public void acceptValuationVisitor(PricingVisitor visitor){
	
		throw new UnsupportedOperationException();
		
	}

}
