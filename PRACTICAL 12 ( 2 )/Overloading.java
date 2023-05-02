class Area{
    float radius;
    float length;
    float width;

    Area(float r){
        radius = r;
        System.out.println("CIRCLE AREA = " + (3.141 * radius * radius));
    }

    Area(float l,float w){
        length = l;
        width = w;

        System.out.println("RECTANGLE AREA = " + (length * width));
    }
    
}

public class Overloading {

    public static void main(String args[]) {
        Area a1 = new Area(3.13f);
        Area a2 = new Area(10.3f,5.2f);
    }
    
}
