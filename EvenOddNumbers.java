
public class EvenOddNumbers {

	public static void main(String[] args) {
		
		int a[]= { 2, 4, 6, 8 ,9, 10};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		int b[]= {1, 3, 5, 7, 9 ,10};
		System.out.println("Even Numbers:");  
		for(int i=0;i<b.length;i++){  
		if(b[i]%2==0){  
		System.out.println(b[i]);  
		}  
		}  
		

	}

}
