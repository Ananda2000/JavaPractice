// The use of compare to method in string classes..


package StringMethodsExercise;

public class CompareToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"this","is","ok"};
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i].compareTo(arr[j]));
				if(arr[i].compareTo(arr[j]) >0) {
					
					String t = arr[j];
					arr[j] =arr[i];
					arr[i] = t;
				}
			}
			System.out.println(arr[i]);
		}
		

	}

}
