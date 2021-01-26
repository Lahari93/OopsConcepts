
public class BoquetCost {
	
	private static int roseCost= 1;
	private static int jasmineCost=2;
	private static int lilyCost=3;
	private static int totalbouquetCost;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		totalbouquetCost=	bouquetCost(3,4,5);
		
	System.out.println("Total Cost of bouquet is " + totalbouquetCost);
	
		

	}
	
	
	
	public static int bouquetCost(int roseCount, int jasmineCount, int lilyCount) {
		
		totalbouquetCost= roseCost*roseCount+jasmineCost*jasmineCount+lilyCost*lilyCount;
	
		return totalbouquetCost;
		
		
		
	}

}
