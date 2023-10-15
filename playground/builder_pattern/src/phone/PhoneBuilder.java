package phone;
public class PhoneBuilder {
    private String os;
    private int ram;


    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os, ram);
    }
}
