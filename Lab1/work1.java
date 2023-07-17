import java.util.Scanner;

public class work1 {
    public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("enter number：");
		int x=input.nextInt();
        if(x<500)
		System.out.println("Your value is too low.");
		else 
		System.out.println("Your value is high enough.");
}
}
