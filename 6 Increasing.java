import java.util.Scanner;

public class Increasing {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input first number: ");
		
		int no1 = input.nextInt();
		System.out.println("Input second number: ");
		int no2 = input.nextInt();
		System.out.println("Input third number: ");
		int no3 = input.nextInt();
		if(no1<no2 && no2<no3){
			System.out.println("Increasing"); 
			
		}

		else if(no1>no2 && no2>no3){ System.out.println("Decreasing");
		
		}
		else{
			
		System.out.println("Neigther Increasing or decreasing order"); }
		
		
		
		
		

	}

}
