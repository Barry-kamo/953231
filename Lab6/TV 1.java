
public class TV {
    int channel = 2;
    int volumeLevel = 10;
    boolean on = false;
    
    public TV() {
    }
    
    public void turnOn() {
      on = true;
    }
    
    public void turnOff() {
      on = false;
    }
    
    public void setChannel(int newChannel) {
      if (on && newChannel >= 0 && newChannel <= 99)
        channel = newChannel;
    }
    
    public void setVolume(int newVolumeLevel) {
      if (on && newVolumeLevel >= 0 && newVolumeLevel <= 20)
        volumeLevel = newVolumeLevel;
    }
    public int getnewvolume(){return volumeLevel;}
    public int getnewchannel(){return channel;}
    public void  Determine(){
        if(on==false)
        System.out.println("off");
        else
        System.out.println("on");
    }
  }