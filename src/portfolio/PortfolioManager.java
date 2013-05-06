package portfolio;


public class PortfolioManager { //Singleton class
	private static PortfolioManager myManager;
	PortfolioComponent accountList;


	
		private PortfolioManager() {
		   
		   //populate portfolio
			PortfolioComponent accountOne = new Portfolio("Account One - " , "FaceBook");
			
			PortfolioComponent accountTwo = new Portfolio("Account Two - " , "Apple");
			
			PortfolioComponent allAccounts = new Portfolio("Main Portfolio", "List all portfolios and account");
			
			allAccounts.add(accountOne);
			
			accountOne.add(new Stocks("Stocks" , 1000.0));
			accountOne.add(new Bonds("Bonds" , 3200.0));
			accountOne.add(new MoneyMarket("Money Market" , 15000.0));

			allAccounts.add(accountTwo);
			accountTwo.add(new Stocks("Stocks" , 31300.0));
			accountTwo.add(new Bonds("Bonds" , 13200.0));
			accountTwo.add(new MoneyMarket("Money Market" , 5000.0));
			
			accountList = allAccounts;
			getAccountList();
			
			System.out.println("===========================================");
			System.out.println("Begin Portfolio Evaluation:");
		    System.out.println("===========================================\n");
			
			//Deploy Visitor
			PricingVisitor visitAccountOne = new PricingVisitor();
			PricingVisitor visitAccountTwo = new PricingVisitor();
			PricingVisitor visitBoth = new PricingVisitor();
			
			accountOne.acceptValuationVisitor(visitAccountOne);
			accountTwo.acceptValuationVisitor(visitAccountTwo);
			accountOne.acceptValuationVisitor(visitBoth);
			accountTwo.acceptValuationVisitor(visitBoth);
			
			System.out.println("Display Evaluation for Account 1: ");
			System.out.println("-----------------------------");
			System.out.println("Account 1 Evaluation :" + visitAccountOne.getTotalValuation() + "\n");
			
			System.out.println("Display Evaluation for Account 2: ");
			System.out.println("-----------------------------");
			System.out.println("Account 2 Evaluation :" + visitAccountTwo.getTotalValuation() + "\n");
			
			System.out.println("Display Evaluation for Both Accounts: ");
			System.out.println("-----------------------------");
			System.out.println("Total Evaluation :" + visitBoth.getTotalValuation() + "\n");
			
			
	   }

	//this is the logic of the singleton class. If this is the first instance of 
	   //the manager, create a new manager, otherwise return last instance
	   public static PortfolioManager getInstance() { 
	      if(myManager == null) {
	         myManager = new PortfolioManager();
	      }
	      else{
	    	  System.err.println("Manager Already Exists.");
	      }
	     
	      return myManager;
	   }
	   
		private void getAccountList(){
			System.out.println("===========================================");
			System.out.println("Displaying Portfolio Information:");
		    System.out.println("===========================================\n");
			accountList.displayAccountInfo();
			
		}
		
}
