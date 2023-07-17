import java.util.Scanner;

public class testtriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of the Triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter the color of the Triangle");
        String color = input.next();
        System.out.println(" Is the Triangle filled? Reply with 'True' or 'False' ");
        boolean filled = input.nextBoolean(); 
        triangle t1= new triangle(side1, side2, side3);
        System.out.println("The Triangle Sides are"+t1.toString());
        System.out.println("The Triangle's Area is " + t1.getArea());
        System.out.println("The Triangle's Perimeter is "+t1.getPerimeter());
        System.out.println("The Triangle's Color is "+t1.setcolor(color));
        System.out.println("Is the Triangle filled? "+t1.setfilled(filled));

    }
}
