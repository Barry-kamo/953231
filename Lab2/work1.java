import java.util.Scanner;

public class work1 {
    public static void main(String[] args){
		int answer1,answer2,x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number : ");
		x=scan.nextInt();
		y=scan.nextInt();
		answer1= mymax(x,y);
		answer2=mymin(x, y);
		System.out.println("Your max is "+ answer1);
		System.out.println("Your min is "+answer2);
	}
	public static int mymin(int x,int y){
		if(x>y)
		return y;
		else
		return x;
	}
	public static int mymax(int x,int y){
		if(x>y)
		return x;
		else
		return y;
	}
}
