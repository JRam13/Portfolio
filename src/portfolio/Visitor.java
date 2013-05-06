package portfolio;

public abstract class Visitor {
	protected double totalValuation;

	public Visitor() {
		this.totalValuation = 0;
	}
	
	public abstract void visitStock(Stocks stock);
	public abstract void visitMoneyMarket(MoneyMarket market);
	public abstract void visitBond(Bonds bond);
	public abstract void visitPortfolio(Portfolio port);
	
	public double getTotalValuation(){
		return totalValuation;
	}

	
}
