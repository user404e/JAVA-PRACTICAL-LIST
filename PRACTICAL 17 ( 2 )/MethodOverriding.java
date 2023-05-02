class Demo1{
    void demo(){
        System.out.println("METHOD OF DEMO 1 CLASS");
    }
}
class Demo2 extends Demo1{
     
    void demo(){
        System.out.println("METHOD OF DEMO 2 CLASS");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();

        d1.demo();
        d2.demo();
    }
}