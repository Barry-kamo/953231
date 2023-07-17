import java.math.BigInteger;

public class lab10_2 {
    public static void main(String[] args) {
		int count = 0;
		BigInteger n = new BigInteger(String.valueOf(Long.MAX_VALUE));
		BigInteger number5 = new BigInteger("5");
		BigInteger number6= new BigInteger("6");
		BigInteger number0 = new BigInteger("0");
		while (count < 10) {
			n = n.add(new BigInteger("1"));
			if ((n.remainder(number5)).compareTo(number0) == 0 || 
				 (n.remainder(number6)).compareTo(number0) == 0) {
				System.out.println(n);
				count++;
			}
		}
	}
}
