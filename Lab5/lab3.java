import java.util.Random;

public class lab3 {
    public static void main(String[] args) {
        Random a = new Random();
        int number = a.nextInt()*(40-20+1);   
        System.out.println(Math.sin(number));
        System.out.println(Math.cos(number));
        System.out.println(Math.tan(number));
    }
}
