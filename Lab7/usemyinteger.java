public class usemyinteger {
    public static void main(String[] args) {
        MyInteger myInteger=new MyInteger(67);
        System.out.println("myInteger.getter()="+myInteger.getter());
		System.out.println("myInteger.isEven()="+myInteger.iseven()
		+"\n"+"myInteger.isOdd()="+myInteger.isodd()
		+"\n"+"myInteger.isPrime()="+myInteger.isprime()
		+"\n"+"MyInteger.isEven(67)="+MyInteger.iseven(67)
		+"\n"+"MyInteger.isOdd(67)="+MyInteger.isodd(67)
		+"\n"+"MyInteger.isPrime(67)="+MyInteger.isprime(67)
		+"\n"+"MyInteger.isEven(myInteger)="+MyInteger.iseven(myInteger)
		+"\n"+"MyInteger.isOdd(myInteger)="+MyInteger.isodd(myInteger)
		+"\n"+"MyInteger.isPrime(myInteger)="+MyInteger.isprime(myInteger)
		+"\n"+"myInteger.equals(67)="+myInteger.equals(67)
		+"\n"+"myInteger.equals(myInteger)="+myInteger.equals(myInteger));
      }
}
