class Rectangle{
    int height;
    int width;
    int area;
    Rectangle(int h,int w){
        height = h;
        width = w;
        area = height * width;

        System.out.println("AREA = " + area);
    }
}

public class Calculate {
    public static void main(String args[]) {

        Rectangle r1 = new Rectangle(8, 3);
    
    }
}
