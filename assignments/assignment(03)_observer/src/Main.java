public class Main {
    public static void main(String[] args) {

        ClockTimer clock = new ClockTimer();

        Observer DigitalClock = new DigitalClock();
        Observer AnalogClock = new AnalogClock();

        clock.attach(DigitalClock);
        clock.attach(AnalogClock);

        for(int i = 0 ; i < 3600 ; i++){
            clock.tick();
        }
    }
}