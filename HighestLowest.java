import java.util.Scanner;

public class HighestLowest {


	static int sumOfValues(int[] arr,int size){
		int res_min = arr[0],res_max = arr[0]; int sum=0;
		for (int i = 1; i < size; i++) {
		res_min = Math.min(res_min, arr[i]);
		res_max = Math.max(res_max, arr[i]); }
		for(int i=0;i<arr.length;i++){
		if(arr[i] == res_min || arr[i] == res_max){
		sum+=0; }
		else{
		sum+=arr[i];
		} }
		return sum; 
		}
		public static void main(String[] args){
		Scanner input=new Scanner(System.in); System.out.print("Enter the size of an array:");
		int size=input.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the values of an array:"); for(int i=0;i<a.length;i++){
		a[i]=input.nextInt(); }
		System.out.println("Sum Of array values except maximum and minimum: "+sumOfValues(a,size));
		} }

		
