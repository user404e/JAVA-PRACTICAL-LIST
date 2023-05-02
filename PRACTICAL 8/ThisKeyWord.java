class Demo{
    int num;

    void data(int num){
         //num = num;      // value cant assign to class member 'num' , because both variables name are same.
        this.num = num;
         // using this keyword which reffer current object  , the value will be assigned.
    }

}

public class ThisKeyWord {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.data(10);
        System.out.println(d1.num);
    }
}
