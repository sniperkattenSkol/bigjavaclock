// Nils E Lindfors TE15 
// 2017-11-29
// 14:40
public class AlarmClock extends Clock {
    private int hour;
    private int min;
    private boolean alarmBoolean;

    public void setAlaram(int h, int m){
            hour = h;
            min = m;
            alarmOn();
    }

    public boolean alarmOn(){
    return alarmBoolean = true;
    }

    public boolean alarmOff(){
       return alarmBoolean = false;
    }

    public void snooze(){
        for (int i = 0; i < 10; i++){
            timeTick();
        }

    }



    public void timeTick(){
        super.timeTick();
        if (alarmOn() == true){
            if (super.getHour() == hour && super.getMin() == min ){
                System.out.println("ALARM");
            }
        }
    }

    public String  getTime(){
        super.getTime();
        if (alarmOn() == true){
            if (super.getHour() == hour && super.getMin() == min ){
                System.out.println("ALARM");
            }
        }
        return "";
    }

}