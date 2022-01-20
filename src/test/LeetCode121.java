package test;

public class LeetCode121 {
	public static void main(String args[])
	{
		int prices[]= {7,1,5,3,6,4};
	
		 int min=Integer.MAX_VALUE,ans=0;
	        for(int x:prices){
	            min=Math.min(min,x);
	            ans=Math.max(x-min,ans);	
	            System.out.println("Minimum is"+min);
	            System.out.println("Maximum is"+ans);
	}
	     

}
}