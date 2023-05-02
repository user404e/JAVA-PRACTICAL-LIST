class Demo1{
    int n = 4;
}

class Demo2 extends Demo1{
        
    void square(){
        System.out.println("SQUARE = " + n*n);
    }
}
class Demo3 extends Demo1{
    void cube(){
        System.out.println("CUBE = " + n*n*n);
    }
}
public class HierarchialInheritance{
    public static void main(String[] args) {
        
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        d2.square();
        d3.cube();
    }
}