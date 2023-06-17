import java.util.HashSet;

public class HashSetExample{
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();

        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("White");

        for(String color:colors){
            System.out.println(color);
        }
    }
}