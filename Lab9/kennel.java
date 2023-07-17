public class kennel {
    public static void main(String[] args){
        Dog dog1=new Dog("a", 2);
        Dog dog2=new Dog("Pom Pom Purin", 4);
        Dog dog3=new Dog("Melody", 3);
        dog1.setname("Cinnamoroll babyCinnamoroll");
        System.out.println(dog1.toString());
        dog2.setage(1);
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
    }
}
