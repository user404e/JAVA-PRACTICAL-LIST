class Demo{
    int a,b,c;
    double d;

    Demo(int n1){
        a = n1;
        System.out.println(a);
    }

    Demo(int n2,int n3){
        b = n2;
        c = n3;
        System.out.println(b + " " + c);
    }

    Demo(double d1){
        d = d1;
        System.out.println(d);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Demo dmo1 = new Demo(12);
        Demo dmo2 = new Demo(32,412);
        Demo dmo3 = new Demo(43.24);
    }
}
