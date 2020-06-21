package eNUM;

public class Enum_Exersice {

	
	public enum Season{
		ANAND,SOMA, GOA,BABU,CHIRANJIVI
	}
	public static void main(String [] args) {
		for(Season s:Season.values()) {
			System.out.println(s);
		}
		System.out.println("=================================================================");
		System.out.println(Season.valueOf("ANAND"));
		System.out.println(Season.valueOf("GOA").ordinal());
	}
}
