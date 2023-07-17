public class Rectangle {
    private float height;
    private float width; 
    public Rectangle(float hei,float  wid){
        height=hei;
        width=wid;  
    }
    public float getheight(){return height;}
    public float getwidth(){return width;}
    public float getarea(){return width*height;}
    public float getPerimeter(){return 2*(width+height);}
}
