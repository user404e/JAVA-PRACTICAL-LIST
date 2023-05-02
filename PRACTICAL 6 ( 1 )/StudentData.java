class Student{
    int enrollmentNO;
    String name;

    public void getdata(int enrno,String nme){
        enrollmentNO = enrno;
        name = nme;
    }

    public void showdata(){
        System.out.println("ENROLLMENT NUMBER = " + enrollmentNO + " , NAME = " + name);
    }
}

public class StudentData {
    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.getdata(7154, "Dev");
        s2.getdata(7151,"Ajay");
        s3.getdata(7155, "Kishan");

        s1.showdata();
        s2.showdata();
        s3.showdata();
    }   
}
