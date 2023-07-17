import java.util.Scanner;

public class primefactors {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=input.nextInt();
        for(int i=2;i<=number;i++){
        while(number%i==0){
            number=number/i;
            if(number!=1)
            System.out.println(i+"");
            else
            System.out.println(i);
        }
            }
    }
}
