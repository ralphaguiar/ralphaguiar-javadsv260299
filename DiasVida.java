package curso_Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class CalcDiasDatasVida {
	public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
		System.out.printf("Entre a data inicial = ");
		String n = sc.next();
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);
        Date d1 = df.parse (n);
        Date d2 = df.parse ("09/10/2032");
        long dt = (d2.getTime() - d1.getTime());
        System.out.println ("FALTAM: " + dt / 86400000L + " DIAS"); 
        sc.close();
	}
}