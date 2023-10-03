package phone;
public class MobileMall {
    public static void main(String[] args) {
        PhoneBuilder builder = new PhoneBuilder();
        builder.setOs("iOS");
        builder.setRam(8);
        Phone myPhone = builder.getPhone();
        System.out.println(myPhone.toString());
    }
}
