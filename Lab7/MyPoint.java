public class MyPoint {
    private double x;
    private double y;
        public MyPoint(){
        x=0;
        y=0;
        }
        public MyPoint(double x, double y){
        this.x=x;
        this.y=y;
        }
    public double distance(MyPoint n) {
            return Math.sqrt(Math.pow(n.x - x, 2) + Math.pow(n.y - y, 2));
        }
    public double distance(double x, double y) {
            return distance(new MyPoint(x, y));
        }
        public static double distance(MyPoint n1,MyPoint n2) {
            return Math.sqrt(Math.pow(n1.x - n2.x, 2) + Math.pow(n1.y - n2.y, 2));
        }
}
