package ExceptionHandling;

public class UseTryCatch {
	
	public static void main(String [] args) {
		
		try {
			System.out.println(1/0);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cant devide by zero");
		//	System.out.println(e);
		}
		checkEligibilty(10, 30);
			
		
		}
	
	public static void checkEligibilty(int stuage, int stuweight){ 
	      if(stuage<12 && stuweight<40) {
	         throw new ArithmeticException("Student is not eligible for registration"); 
	     // System.out.println("+++++++++++++++");
	      }
	      else {
	         System.out.println("Student Entry is Valid!!"); 
	      }
	   } 

}
