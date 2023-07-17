public class testv {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(50);
        tv1.setVolume(10);
        System.out.println("the channel is "+tv1.getnewchannel());
        System.out.println("the volume is "+tv1.getnewvolume());
        tv1.Determine();
        tv1.turnOff();
        tv1.Determine();
      }
}
