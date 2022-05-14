
public class SecondLargestNumber {

	public static int getSecondLargest(int[] a, int total){  
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
		       return a[total-2];  
		}  
		public static void main(String args[]){  
			
		int a[]={3,4,5,3,6,8,9};  
		
		int b[]={101,192,843,84,930,34,354};  
		
		System.out.println("Second Largest: "+getSecondLargest(a,6)); 
		
		System.out.println("Second Largest: "+getSecondLargest(b,7));  
		}}  

		
