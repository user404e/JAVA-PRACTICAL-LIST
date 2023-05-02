class Rectangle{
    int height;
    int width;

    Rectangle(int h, int w){
        height=h;
        width=w;
    }
}

public class Calculate {

    public static void main(String args[]) {

        Rectangle r1 = new Rectangle(5, 10);

        System.out.println("Height = " + r1.height);
        System.out.println("Width = " + r1.width);
        
    }   
}
