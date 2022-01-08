public class Ex3 {
    public static void main(String[] args) {
        SmartTV ex = new SmartTV(5, "0x1234");
        System.out.println(ex.getSize());
        System.out.println(ex.getVideoIn());
        System.out.println(ex.getIpAddr());
    }
}

class WideTV { 
    int size;
    boolean videoIn;
    public WideTV(int size, boolean videoIn) { 
        this.size = size;
        this.videoIn = videoIn; 
    }
    int getSize() { return size; }
    void setSize(int size) { this.size = size; } 
    boolean getVideoIn() { return videoIn; } 
    void setVideoIn(boolean videoIn)
    { this.videoIn = videoIn; }
}

class SmartTV extends WideTV{ 
    String ipAddr;
    public SmartTV(int size, String ipAddr) { 
        super(size, true);
        this.ipAddr = ipAddr; 
    }
    String getIpAddr () { return ipAddr; } 
    void setIpAddr (String ipAddr) { this.ipAddr = ipAddr; }
}