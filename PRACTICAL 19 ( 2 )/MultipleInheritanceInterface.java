interface demo1{
    public void d1();
}

interface demo2{
    public void d2();
}

class Demo implements demo1,demo2{
    public void d1(){
        System.out.println("d1");
    }

    public void d2(){
        System.out.println("d2");
    }
}

public class MultipleInheritanceInterface {
    public static void main(String[] args) {
        
        Demo d = new Demo();

        d.d1();
        d.d2();
    }
}
