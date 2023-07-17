public class CarTest {
    public static void main(String[] args){
        Car car1=new Car("Toyota", "33 STRADALE" , 1968);
        Car car2=new Car("Alfa Romeo", "Altima" , 2011);
        Car car3=new Car("Alfa Romeo", "Giulia", 1800);
        car1.setmake("Alfa Romeo");
        System.out.println(car1.toString());
        System.out.println(car1.isAntique());
        car2.setmodel("4C");
        System.out.println(car2.toString());
        System.out.println(car2.isAntique());
        car3.setyears(2020);
        System.out.println(car3.toString());
        System.out.println(car3.isAntique());
    }
}
