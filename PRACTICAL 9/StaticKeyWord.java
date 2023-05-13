public class StaticKeyWord {

    String s = "Hey There";

    static void showdata(){
        System.out.println(20);
    }

    public static void main(String[] args) {
        showdata(); // showdata() method is static so we can access it without creating object.
        System.out.println(s); //this statement throw error because s variable is not static.
    }
}
