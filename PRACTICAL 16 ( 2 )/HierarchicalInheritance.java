class A{
    String s1 = "Hello ";
}

class B extends A{
        
    String s2 = s1 + "World";
}
class C extends A{
    
    String s3 = s1 + "Java";
}

public class HierarchicalInheritance{
    public static void main(String[] args) {
        
        B b1 = new B();
        C c1 = new C();

        System.out.println(b1.s2);
        System.out.println(c1.s3);
    }
}