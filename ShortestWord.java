import java.util.Scanner;

public class ShortestWord {

	static String shortWord="";
	public static int shortLengthWord(String str)
	{
		int len = str.length();
	int startIndex = 0, endIndex = 0;
	int minLength = len, minStartIndex = 0;
	while (endIndex <= len) {
	if (endIndex < len && str.charAt(endIndex) != ' ')
	{
	endIndex++; }
	else {
	int currentLength = endIndex - startIndex; if (currentLength < minLength)
	{
	minLength = currentLength;
	minStartIndex = startIndex; }
	endIndex++;
	startIndex = endIndex; }
	}
	shortWord = str.substring(minStartIndex, minStartIndex + minLength); int shortLen=shortWord.length();
	return shortLen;
	}
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value of String: ");
	String str=input.nextLine();
	System.out.println("Length Of Shortest Word: "+shortLengthWord(str));
	} }

	
	
	
	

