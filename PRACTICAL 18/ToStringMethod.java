class Car{
    double topSpeed;
    String name;

    Car(double speed,String nme){
        topSpeed = speed;
        name = nme;
    }

    public String toString() {    
        return "CAR NAME = " + name + " , TOP SPEED = " + topSpeed;
    }
}
public class ToStringMethod {
    public static void main(String[] args) {
        Car c1 = new Car(300,"BUGATI");
        Car c2 = new Car(275,"FERRARI");
        Car c3 = new Car(250, "BMW");
        Car c4 = new Car(260,"MUSTANG");
        Car c5 = new Car(250,"JAGUAR");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}