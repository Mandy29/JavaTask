
public class SecondSmallestNumber {

public static int getSecondSmallest(int[] a, int total){  
		
		int temp;  
		
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
		public static void main(String args[]){  
			
		int a[]={4,5,6,73,57,45};  
	
		int b[]={1,3,45,67,86,67,6,76};  
		
		System.out.println("Second smallest: "+getSecondSmallest(a,6));  
		
		System.out.println("Second smallest: "+getSecondSmallest(b,7));  
		}}  

