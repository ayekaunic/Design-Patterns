package phone;
public class Phone {
    private String os;
    private int ram;

    public Phone(String os, int ram) {
        super();
        this.os = os;
        this.ram = ram;
    }

    public String toString() {
        return "OS: "+this.os+"\nRAM:"+this.ram;
    }
}
