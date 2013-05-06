package portfolio;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class PortfolioIterator implements Iterator {

	private int index;
	ArrayList <PortfolioComponent> portList;
	
	public PortfolioIterator(ArrayList<PortfolioComponent> newPortList){
		index = 0;
		portList = newPortList;
	}

	@Override
	public boolean hasNext() {
		if(index  < portList.size()){
			return true;
		}
		return false;
	}

	@Override
	public PortfolioComponent next() {
		// TODO Auto-generated method stub
		return (PortfolioComponent) portList.get(index++);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	public PortfolioComponent first() {
		return (PortfolioComponent) portList.get(0);
	}
	
	public PortfolioComponent currItem(){
		return (PortfolioComponent) portList.get(index);
	}
	
	public boolean isDone(){
		if(index++ == portList.size()){
			return true;
		}
		return false;
	}
	
}
