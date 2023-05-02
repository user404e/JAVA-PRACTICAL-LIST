class Shape{
    float radius;
    float length;
    float width;

    void area(float r){
        radius = r;
        System.out.println(3.141*radius*radius);
    }

    void area(float w,float l){
        length = l;
        width = w;
        System.out.println(length*width);
    
    }
}
public class Overloading {
    public static void main(String args[]) {
        Shape s1 = new Shape();

        s1.area(2.3f);
        s1.area(10.5f,5.5f);
    }
}
