import java.util.Scanner;
import java.util.Random;

public class lab10_1 {
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	System.out.println("input your first name:");
	String fn = input.next();
	System.out.println("input your last name:");
	String ln = input.next();
	char fl = fn.charAt(0);
	String fivel = ln.substring( 0 , 5 );
	Random r = new Random();
	int n = r.nextInt(100)+10;
	System.out.println(fl+""+fivel+""+n);
	}
}
