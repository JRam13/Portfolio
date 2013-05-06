package portfolio;

public class PricingVisitor extends Visitor {

	
	public PricingVisitor(){
		super();
	}
	
	@Override
	public void visitStock(Stocks stock) {
		this.totalValuation += stock.getAccountValue();
		
	}

	@Override
	public void visitMoneyMarket(MoneyMarket market) {
		this.totalValuation += market.getAccountValue();
		
	}

	@Override
	public void visitBond(Bonds bond) {
		this.totalValuation += bond.getAccountValue();
		
	}

	@Override
	public void visitPortfolio(Portfolio port) {
		// TODO Auto-generated method stub
		
	}

}
