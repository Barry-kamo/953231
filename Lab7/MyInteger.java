public class MyInteger {
    private int value;
    public MyInteger(int value){
        this.value=value;
    }
    public int getter(){
        return value;
    }
    public boolean iseven(){
        if (value % 2 == 0)
        return true;
        else
        return false;
    }
    public boolean isodd(){
        if (value%2!=0)
        return true;
        else
        return false;
    }
    public boolean isprime(){
        for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
    }
    public static boolean iseven(int value){
        if (value % 2 == 0)
        return true;
        else
        return false;
    }
    public static boolean isodd(int value){
        if (value%2!=0)
        return true;
        else
        return false;
    }
    public static boolean isprime(int value){
		for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
    public static boolean iseven(MyInteger n){
        return n.iseven(); 
    }
    public static boolean isodd(MyInteger n){
       return n.isodd();
    }
    public static boolean isprime(MyInteger n){
        return n.isprime();
    }
    public boolean equals(int value){
        return this.value==value;
    }
    public boolean equals(MyInteger n){
        return this.value==n.value;
    }
}