import java.util.Scanner;

public class Options {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the value of number 1: ");
		int first=input. nextInt();
		System.out.print("Enter the value of number 2:");
		int second = input. nextInt();
		int choice;
		do {
		System.out.println("\n1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Division"); 
		System.out.println("4 - Multiplication"); 
		System.out.println("5 - Average"); 
		System.out.print("Enter the input:");
		choice=input. nextInt();
		switch(choice) {
		
		case 1:
			int sum=first+second; 
			System.out.println("Addition: "+sum);
			if(sum<0){
			System.out.println("Adition");
			}
			break;
			
		case 2:
			int subtract = first-second;
			System.out.println("Substraction: " + subtract );
			if(subtract < 0) {
				System.out.println("Substraction ");
			}
				break;
				
				case 3:
					float division = first/second;
					System.out.println("Division " + division);
				if(division<0) {
					
					System.out.println("Divison") ;
					
				}
					break;
					
					case 4:
						
					int multiplication=first*second; 
					
					System.out.println("Multiplication: "+multiplication);
					
					if(multiplication<0){
						
					System.out.println("Multiplication");
					}
					break;
					
					case 5:
					float average=((first+second)/2); 
					
					System.out.println("Average: "+average); 
					
					if(average<0){
						
					System.out.println("Average"); 
					}
					break;
					
					default:
						
					break;
					}
					}
					while(choice<6);
					
					
					
					}

}		

				
	
