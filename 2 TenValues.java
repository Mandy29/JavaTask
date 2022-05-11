import java.util.Scanner;

public class TenValues {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in); 
		
		int [] array = new int[10];
		int sum = 0;
		
		for (int i=0; i <array.length; i++ ) {
			System.out.println("Enter the number" + (i+1));
			array[i] = input.nextInt();
			sum+=array[i];
		
			
		System.out.println("The sum is:" + sum);
	
	
	double average = sum/array.length;
	System.out.println("The average of sum" + average);
	
}

		}
}
