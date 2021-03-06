// Nils E Lindfors TE15 
// 2017-11-22
// 13:13
public class Clock {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    private boolean s = false;
    String ampmString = "AM";


    Clock(){
        s =false;
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        this.hours.setValue(0);
        this.minutes.setValue(0);
    }

    Clock(boolean s) {
        this.s = s;
            this.hours = new NumberDisplay(24);
            this.minutes = new NumberDisplay(60);
            this.hours.setValue(0);
            this.minutes.setValue(0);

    }

    public Clock(int hour, int minute, boolean s) {
        this.s = s;
        this.hours.setValue(hour);
        this.minutes.setValue(minute);

    }

    public void timeTick() {
        this.minutes.increment();
        if (this.minutes.getValue() == 0) {
            this.hours.increment();
            if (s == true) {
                if (this.hours.getValue() >= 12) {
                    hours.setValue(1);
                }
                if (ampmString.equals("AM")) {
                    ampmString = "PM";
                } else {
                    ampmString = "AM";
                }
            }else {
                ampmString = "AM";

            }
        }


    }

    public void setTime(int hour, int minute) {
        if (s == true) {
            if (hour > 12) {
             hour = hour - 12;

            }else if (hour == 0){
                hour = 1;
            }
        }
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
    }

    public void setTime(int hour, int minute, String ampm) {
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
        this.ampmString = ampm.toUpperCase();


    }

    public void switchFormat() {
        if (s == true) {
            s = false;

            if (ampmString.equals("PM")) {
                hours.setValue(hours.getValue() + 12);
            }else{

            }
        } else {
            s = true;
            if (hours.getValue() > 12) {
                hours.setValue(hours.getValue() - 12);
                ampmString = "PM";
            } else if (hours.getValue() == 0){
                hours.setValue(1);
                ampmString = "AM";
            } else {
                ampmString = "AM";
            }
        }
    }


    public String getTime(){
        updateDisplay();
        return displayString;
    }

    private void updateDisplay() {
        if (s == true) {
            displayString = this.hours.getDisplayValue() + ":" + this.minutes.getDisplayValue() + " " + ampmString;
        } else {
            displayString = this.hours.getDisplayValue() + ":" + this.minutes.getDisplayValue();
        }
    }

    public int getHour(){
       return this.hours.getValue();
    }

    public int getMin(){
        return this.minutes.getValue();
    }
}
