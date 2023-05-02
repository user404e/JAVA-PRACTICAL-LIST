class Student{
    int enrollmentNO;
    String name;

    public void data(int enrno,String nme){

        enrollmentNO = enrno;
        name = nme;

        System.out.println("NAME = " + name);
    }
}

public class StudentData {
    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.data(7154, "Dev");
        s2.data(7151,"Ajay");
        s3.data(7155, "Kishan");
    }   
}
