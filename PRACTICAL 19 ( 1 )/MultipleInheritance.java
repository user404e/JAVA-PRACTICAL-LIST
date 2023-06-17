interface i1{
    public void a();
}

interface i2{
    public void b();
}

class c1 implements i1,i2{
    public void a(){
        System.out.println("METHOD OF I1");
    }

    public void b(){
        System.out.println("METHOD OF I2");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        c1 c = new c1();

        c.a();
        c.b();
    }
}