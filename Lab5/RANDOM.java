import java.util.Random;

public class RANDOM {
    public static void main(String[] args) {
        Random n = new Random(1000);
        int a;
        int s=0;
        for(a=0;a!=50;a++){
        
        s = n.nextInt(100);
        System.out.println(s);}
    }
}
