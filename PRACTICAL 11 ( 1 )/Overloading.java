class Shape{
    float radius;
    float length;
    float width;

    void area(float radius){
        this.radius = radius;
        System.out.println(3.141*radius*radius);
    }

    void area(float width,float length){
        this.length = length;
        this.width = width;
        System.out.println(length*width);
    
    }
}
public class Overloading {
    public static void main(String args[]) {
        Shape s1 = new Shape();

        s1.area((float)2.3);
        s1.area((float)10.5,(float)5.5);
    }
}
