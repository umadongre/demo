import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CountCost {
   static int min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] costs= {300,400,600,700};
       int totalminCost = 0;
       boolean flag=false;
       ArrayList<Integer> reachedtemple=new ArrayList<Integer>();
       ArrayList<Integer> costList=new ArrayList<Integer>();
         for (Integer cost : costs) {
			costList.add(cost);
		}
         Collections.sort(costList);
         
         System.out.println(costList.size());
         if(costList.size() ==2) {
        	 min=costList.get(1);
         }else {
         
         for(int ind=0;ind<=costList.size()-1;ind++) {
        	 flag=false;
        	 reachedtemple.add(costList.get(ind));
        	 if((ind+1)<costList.size()) {
        	 reachedtemple.add(costList.get(ind+1));
        	 totalminCost=totalminCost+costList.get(ind+1);
        	 ind++;
        	 flag=true;
        	 }
        	 if(flag==true) {
        	 min=findmin(reachedtemple);
        	 reachedtemple.remove(0);
        	 min=totalminCost+min;
        	 }else {
        		 min=min+costList.get(ind);
        	 }
        	
         }
         }
         System.out.println("Cost required to reach village"+min);
	}
	private static int findmin(ArrayList<Integer> reachedtemple) {
		// TODO Auto-generated method stub
		 Collections.sort(reachedtemple);
		return min+reachedtemple.get(0);
	}
	

}
