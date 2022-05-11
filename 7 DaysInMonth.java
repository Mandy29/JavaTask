import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		
		int month;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter month from 1 to 12");
		month = sc.nextInt();
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("\n 31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("\n 30 days");
			break;
		
		}
		
		
		
		
		
		
		
		
	}

}
