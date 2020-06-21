package StringMethodsExercise;

public class ConcatenationExample {

	 
	 
		 
				 int rollno;  
				 String name;  
				 String city;  
				  
				 ConcatenationExample(int rollno, String name, String city){  
				 this.rollno=rollno;  
				 this.name=name;  
				 this.city=city;  
				 }  
				  
				 public static void main(String args[]){  
					 ConcatenationExample s1=new ConcatenationExample(101,"Raj","lucknow");  
					 ConcatenationExample s2=new ConcatenationExample(102,"Vijay","ghaziabad");  
				     
				   System.out.println(s1);//compiler writes here s1.toString()  
				   System.out.println(s2);//compiler writes here s2.toString()  
				 }  
				
		}

