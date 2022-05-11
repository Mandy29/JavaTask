import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter a Year: ");
        Scanner in =  new Scanner(System.in);
        int yy = in.nextInt();
        if(yy%4==0){
            if(yy%100==0){
                if(yy%400==0)
                    System.out.println(yy+" is a leap year.");
                else
                    System.out.println(yy+" is not a leap year.");
                System.out.println(yy+" is a leap year.");
            } else{
                System.out.println(yy+" is not a leap year.");

		
		
		
	}

}
}}