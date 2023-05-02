class Student{
    int enrollmentNO;
    String name;
}

public class StudentData {
    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.enrollmentNO = 7154;
        s1.name = "Dev";

        s2.enrollmentNO = 7151;
        s2.name = "Ajay";

        s3.enrollmentNO = 7155;
        s3.name = "Kishan";

        System.out.println("ENROLLMENT NUMBER = " + s1.enrollmentNO + " , NAME = " + s1.name);
        System.out.println("ENROLLMENT NUMBER = " + s2.enrollmentNO + " , NAME = " + s2.name);
        System.out.println("ENROLLMENT NUMBER = " + s3.enrollmentNO + " , NAME = " + s3.name);
    }   
}

