import java.util.Scanner;

public class lab10_2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter Lowercase String :  ");
		String lowStr = input.nextLine();
		char[] c = lowStr.toCharArray();
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] >= 'a' && c[i] <= 'z') {
				c[i] = (char) ((int)c[i] - 32);;
			}
		}
		System.out.print("The Uppercase String  =  ");
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println("\neasy ways :"+lowStr.toUpperCase());
	}
}