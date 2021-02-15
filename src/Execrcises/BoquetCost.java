package Execrcises;

public class BoquetCost {
	
	private  int roseCost= 1;
	private  int jasmineCost=2;
	private  int lilyCost=3;
	private  int totalbouquetCost;

	public static void main(String[] args) {
		
		BoquetCost boquetCost= new BoquetCost();
		
		boquetCost.	totalbouquetCost=boquetCost.bouquetCost(3,4,5);
		
	System.out.println("Total Cost of bouquet is " +boquetCost.totalbouquetCost);

	}
	
	
	public  int bouquetCost(int roseCount, int jasmineCount, int lilyCount) {
		
		totalbouquetCost= roseCost*roseCount+jasmineCost*jasmineCount+lilyCost*lilyCount;
	
		return totalbouquetCost;
		
		
		
	}

}
