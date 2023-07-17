public class MyCar {
    public static void main(String[] args){
        Car car1= new Car("red");
        car1.setspeed(200);
        car1.setmilage(1345);
        System.out.println("toyota has "+car1.getcolor()+" color,speed of "+car1.getspeed()+" and mileage of "+car1.getmilage());

        Car car2=  new Car("blue");
        car2.setspeed(300);
        car2.setmilage(8987);
        System.out.println("honda has "+car2.getcolor()+" color,speed of "+car2.getspeed()+" and mileage of "+car2.getmilage());
    }
}
