public class MyRectangle {
    public static void main(String[] args){
        Rectangle tan1= new Rectangle(5,5);
        System.out.println("square "+tan1.getheight()+"x"+tan1.getwidth());
        System.out.println("area: "+tan1.getarea());
        System.out.println("Perimeter: "+tan1.getPerimeter());
        System.out.println("");
        Rectangle tan2= new Rectangle(8,5);
        System.out.println("square "+tan2.getheight()+"x"+tan2.getwidth());
        System.out.println("area: "+tan2.getarea());
        System.out.println("Perimeter: "+tan2.getPerimeter());
    }
}
