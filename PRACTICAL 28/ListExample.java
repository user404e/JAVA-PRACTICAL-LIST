import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample{
    public static void main(String[] args) {
        ArrayList<String> w = new ArrayList<>();
        LinkedList<String> m = new LinkedList<>();

        w.add("Monday");
        w.add("Tuesday");
        w.add("Wednesday");
        w.add("Thursday");
        w.add("Friday");
        
        m.add("January");
        m.add("February");
        m.add("March");
        m.add("April");
        m.add("May");
        m.add("June");
        m.add("July");
        m.add("August");
        m.add("September");
        m.add("October");
        m.add("November");
        m.add("December");

        System.out.println("Weekdays = " + w);
        System.out.println("Months = " + m);
    }
}