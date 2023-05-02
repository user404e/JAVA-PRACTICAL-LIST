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
        Area a1 = new Area((float)3.13);
        Area a2 = new Area((float)23.42,(float)10.23);
    } 
}
