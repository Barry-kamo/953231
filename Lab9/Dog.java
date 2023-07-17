public class Dog {
    private String name;
    private int age;
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getname(){return this.name;}
    public int getage(){return this.age;}
    public int personage(){return this.age*7;}
    public void setname(String name){
        this.name=name;}
    public void setage(int age){
        this.age=age;}
        public String toString(){
            String dogname= "Dog's name: ";
            String dogage= "Dog's age: ";
            String personsage="Dog's age equals person's age:";
            return dogname + name + "\t" + dogage +  age +"\t" + personsage + age*7;}
}
