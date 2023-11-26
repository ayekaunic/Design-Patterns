public class AnalogClock extends Observer{
    public void update(Subject subject){
        int[] x = subject.getState();
        System.out.println("Analog Clock\n" + x[0] +":"+x[1]+":"+x[2]);
    }
}
