// Nils E Lindfors TE15 
// 2017-11-22
// 12:53
public class NumberDisplay {
    private int limit;
    private int value;

    NumberDisplay(int MaxLimit){
        limit = MaxLimit;
        value = 0;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int newValue){
        if (newValue < limit && newValue > 0) {
            value = newValue;
            }
        }

    public String getDisplayValue() {
        if (value < 10) {
            return "0"+value;
        } else {
            return ""+value;
        }
    }

    public void increment(){
        if (value < limit-1){
            value++;
        }else {
            value = 0;
        }
    }


}

