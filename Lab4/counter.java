public class counter {
    private int value;
    public counter(){
        value=0;  
    }
    public void click() {
        value = value + 1;
    }
    public void reset() {
        value = 0;
    }
    public void getcount(){
        System.out.println("the value is "+value);
    }
}
