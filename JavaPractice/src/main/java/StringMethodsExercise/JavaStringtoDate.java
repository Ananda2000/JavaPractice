//Java String to Date

package StringMethodsExercise;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JavaStringtoDate {

	public static void main(String [] args) throws ParseException {
		String date1 = "31/12/1986";
		Date dates = (Date) new SimpleDateFormat("dd/mm/yyyy").parse(date1);
		
		System.out.println(date1 +"      "+dates);
	}
}
