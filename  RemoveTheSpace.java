import java.util.Scanner;

public class RemoveTheSpace {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		System.out.println("Enter the String value:"); 
		String str=input.nextLine();
		str = str.replaceAll("\\s", "");
		System.out.println(str); 
		}
		}

