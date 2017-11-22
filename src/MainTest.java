// Nils E Lindfors TE15 
// 2017-11-22
// 13:06
public class MainTest {

    public static void main(String[] args) {
       /* NumberDisplay numb = new NumberDisplay(60);
        System.out.println(numb.getValue());
        numb.increment();
        System.out.println(numb.getValue());
        System.out.println(numb.getDisplayValue());
        numb.setValue(59);
        System.out.println(numb.getValue());
        numb.increment();
        System.out.println(numb.getValue());
        */

       Clock ck = new Clock(false);
        ck.setTime(12,58);
        System.out.println(ck.getTime());
       ck.switchFormat();
        System.out.println(ck.getTime());
        ck.timeTick();
        System.out.println(ck.getTime() + "as");
        ck.switchFormat();
        ck.timeTick();
        System.out.println(ck.getTime());
        ck.timeTick();
        System.out.println(ck.getTime());





    }
}
