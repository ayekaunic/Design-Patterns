public class ClockTimer extends Subject {

    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    public void attach(Observer observer){
        super.observers.add(observer);
    }

    public void detach(Observer observer){
        super.observers.remove(super.observers.indexOf(observer));
    }

    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update(this);
        }
    }

    public int[] getState(){
        int[] status = new int[3];
        status[0] = hours;
        status[1] = minutes;
        status[2] = seconds;
        return status;
    }

    public void tick(){
        if(seconds< 59){
            seconds+=1;
        }
        else if(seconds >= 59 && minutes<59){
            seconds = 0;
            minutes+=1;
        }
         else if(seconds >= 59 && minutes>= 59){
             seconds = 0;
             minutes = 0;
             hours +=1;
        }
         else if(seconds>=59 && minutes >=59 && hours>=23){
             hours = 0;
             seconds = 0;
             minutes = 0;
        }
        
        notifyObservers();

        System.out.println();
    }
}
