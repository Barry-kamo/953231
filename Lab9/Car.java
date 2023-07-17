public class Car {
  private String make;
  private String model;
  private int years;
public Car(String make,String model,int years){
    this.make=make;
    this.model=model;
    this.years=years;  
}
public String getmake(){return make;}
public String getmodel(){return model;}
public int getyears(){return years;}
public void setmake(String make){
    this.make=make;
}
public void setmodel(String model){
    this.model=model;
}
public void setyears(int years){
    this.years=years;
}
public boolean isAntique(){
    if((2021-years)>45)
    return true;
    else
    return false;
}
public String toString(){
    return "Car's make:" +make + "\t" + "Car's model:" + model +"\t" + "Car's years" + years;}
}
