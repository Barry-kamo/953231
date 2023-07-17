import java.util.Scanner;

public class work2 {
    public static void main(String[] args){
		Scanner input =new Scanner(System.in);
        System.out.println("Welcome to OOP Lab");
            System.out.println("1. menu 1");
            System.out.println("2. menu 2");
            System.out.println("3. menu 3");
            System.out.println("4. menu 4");
            System.out.println(" 5. Bye Bye");
		    System.out.print("enter number：");
		int x=input.nextInt();
        if(x==1)
		System.out.println("Welcome to menu 1.");
        if(x==2)
		System.out.println("Welcome to menu 2.");
        if(x==3)
		System.out.println("Welcome to menu 3.");
        if(x==4)
		System.out.println("Welcome to menu 4.");
        if(x==5)
		System.out.println("Bye bye, see you tomorrow.");
}
}