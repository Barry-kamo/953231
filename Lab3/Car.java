import java.security.KeyStore.PrivateKeyEntry;

public class Car {
  private String color;
  private int speed;
  private int milage;
public Car(String col){
    color=col;
    speed=0;
    milage=0;  
}
public String getcolor(){return color;}
public int getspeed(){return speed;}
public int getmilage(){return milage;}
public void setspeed(int sp){
    speed=sp;
}
public void setmilage(int ml){
    milage=ml;
}
}
