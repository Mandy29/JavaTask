import java.util.Scanner;

public class JavaTraining {

	public static void main(String[] args) {

	String str= " ";
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num = s.nextInt();
		
		if(num% 5 == 0)
		{
		str =  "JAVA Training";
		}
		else if (num % 3 ==0)
		{
			str = "Consultadd";
		
		}
		else if((num %5==0)&& (num %3 ==0))
{
	str = "Consultadd JAVA Training";
	
}
		System.out.println(str);
	}

}
