
public class work2 {
    public static void main(String[] args){
		for(int x=40;x<=80;x=x+5){
			int f;
			f=cToF(x);
			System.out.println(x+"   "+f);
		}
	}
	public static int cToF(int x){
        x =(9/5)*x+32;
        return x;
	}
}