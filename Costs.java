import java.util.*; 

class Costs
{ 
	//function to calculate cost
	static int minimumCost(int costs[], int numberofpersons) 
	{ 
	
		Arrays.sort(costs); 
		int totalCost = 0; 
	
		for (int i = numberofpersons - 1; i > 1; i -= 2) 
		{ 
			if (i == 2) 
			{ 
				totalCost += costs[2] + costs[0]; 
			} else{ 
	
				// Both the ways as discussed above 
				long priceCheap = costs[i] + costs[0] + 2 * costs[1]; 
				long priceHigh = costs[i] + costs[i - 1] + 2 * costs[0]; 
				totalCost += Math.min(priceCheap, priceHigh); 
			} 
		} 
	
		if (numberofpersons == 1) 
		{ 
			totalCost += costs[0]; 
		} else{ 
			totalCost += costs[1]; 
		} 
	
		return totalCost; 
	} 
	

	public static void main (String[] args) 
	{ 
		int costs[] = { 600, 800, 150, 700}; 
		int numberofpersons = costs.length; 
	
		System.out.println("Minimum cost required="+minimumCost(costs, numberofpersons)); 
	} 
} 


