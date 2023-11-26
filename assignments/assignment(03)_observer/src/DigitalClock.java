public class DigitalClock extends Observer{
    public void update(Subject subject){
        int[] x = subject.getState();
        System.out.println("Digital Clock\n" + x[0] +":"+x[1]+":"+x[2]);
    }
}
