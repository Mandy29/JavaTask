
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		int myArray1[] = {11, 22, 32, 44, 55};
	      int myArray2[] = {55, 44, 23, 26, 37};
	      System.out.println("Intersection of the two arrays ::");
	     
	      for(int i = 0; i<myArray1.length; i++ ) {
	         for(int j = 0; j<myArray2.length; j++) {
	            if(myArray1[i]==myArray2[j]) {
	               System.out.println(myArray2[j]);
	            }
	         }
	      }
	}

}
