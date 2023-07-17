import java.math.BigInteger;

public class lab10_1 {
    public static void main(String[] args){
        String number = ""+1;
        for (int i = 0; i < 49; i++) {

            number += "0";
        }

        BigInteger Number = new BigInteger(number);
        int Count = 0;
        while (Count < 10) {
            BigInteger numberdivideby2 = Number.remainder(new BigInteger("2"));
            BigInteger numberdivideby3 = Number.remainder(new BigInteger("3"));
            if (numberdivideby2.equals(BigInteger.ZERO) || numberdivideby3.equals(BigInteger.ZERO)) {
                Count++;
                System.out.println(Number);
            }
            Number = Number.add(BigInteger.ONE);
        }
    }
}
