package portfolio;

import java.util.ArrayList;


public class Portfolio extends PortfolioComponent{

	ArrayList<PortfolioComponent> portfolioComponents = new ArrayList<PortfolioComponent>();
	
	String accountName;
	String accountDescription;
	
	public Portfolio(String nameAccountName, String newAccountDescription){
		
		accountName = nameAccountName;
		accountDescription = newAccountDescription;
		
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAccountDescription() {
		return accountDescription;
	}
	
	public void add(PortfolioComponent newPortfolioComponent){
		portfolioComponents.add(newPortfolioComponent);
	}
	
	public void remove(PortfolioComponent newPortfolioComponent){
		portfolioComponents.remove(newPortfolioComponent);
	}
	
	public PortfolioComponent getComponent(int componentIndex){
		
		return (PortfolioComponent)portfolioComponents.get(componentIndex);
	}
	
	public void displayAccountInfo(){
		
		System.out.println("Displaying Information for :");
	    System.out.println("----------------------------------\n");
		System.out.println(getAccountName() + " " + getAccountDescription());
		
		//create iterator here, list accounts
		PortfolioIterator iterator = new PortfolioIterator(portfolioComponents);
		
		while(iterator.hasNext()){
			PortfolioComponent portfolioInfo = (PortfolioComponent) iterator.next();
			portfolioInfo.displayAccountInfo();
		}
		
	}
	
	public void acceptValuationVisitor(PricingVisitor visitor) {
		
		PortfolioIterator iterator = new PortfolioIterator(portfolioComponents);
		
		while(iterator.hasNext()){
			PortfolioComponent portfolioInfo = (PortfolioComponent) iterator.next();
			portfolioInfo.displayAccountInfo();
			
			if(portfolioInfo instanceof Bonds ){
				visitor.visitBond((Bonds) portfolioInfo);
			}
			if(portfolioInfo instanceof Stocks ){
				visitor.visitStock((Stocks) portfolioInfo);
			}
			if(portfolioInfo instanceof MoneyMarket ){
				visitor.visitMoneyMarket((MoneyMarket) portfolioInfo);
			}
			if (portfolioInfo instanceof Portfolio) {
				portfolioInfo.acceptValuationVisitor(visitor);
			}
		}
		
	}
	
}
