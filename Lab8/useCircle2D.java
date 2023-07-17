import java.util.Scanner;

public class useCircle2D {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input x , y , raduis");
        Circle2D c1=new Circle2D(input.nextDouble(),input.nextDouble(),input.nextDouble());
        System.out.println("X="+c1.getx()
        +"\n"+"Y="+c1.gety()
        +"\n"+"RADIUS="+c1.getradius()
        +"\n"+"AREA="+c1.getArea()
        +"\n"+"PERIMETER="+c1.getPerimeter());
    }
}
