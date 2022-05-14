import java.util.Arrays;
import java.util.Scanner;

public class Isogram {

	public static boolean isIsogram(String str)
	{
		str=str.toLowerCase();
	int len=str.length();
	char[] c=str.toCharArray();
	Arrays.sort(c);
	for(int i=0;i<len-1;i++)
	{
		
	if (c[i] == c[i + 1]) return false;
	
	}
	return true;
	}
	
	public static void main(String[] args){
	Scanner input=new Scanner(System.in); System.out.println("Enter the String value:"); String str=input.nextLine(); System.out.println(isIsogram(str));
	} }

	
	