public class usemypoint {
    public static void main(String[] args) {
        MyPoint n1=new MyPoint();
        MyPoint n2=new MyPoint(10,30.5);
        System.out.println("(0,0) of distance is "+n1.distance(n1));
        System.out.println("(10,30.5) of distance is "+n1.distance(n2));
        System.out.println("(0,0) of distance is "+n1.distance(0, 0));
        System.out.println("(10,30.5) of distance is "+n1.distance(10,30.5));
        System.out.println(MyPoint.distance(n1,n2));
    }
}
