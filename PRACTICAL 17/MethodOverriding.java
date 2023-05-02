class A{
    void demo(){
        System.out.println("CLASS A");
    }
}
class B extends A{
    void demo(){
        System.out.println("CLASS B");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.demo();
        b1.demo();
    }
}