import java.util.HashMap;

public class StudentData{
    public static void main(String[] args) {
        HashMap<Integer,String> data = new HashMap<>();

        data.put(7151, "Ajay");
        data.put(7153, "Bhavya");
        data.put(7154, "Devendra");
        data.put(7155, "Kishan");
        data.put(7198, "Harsh");
        
        for (Integer enrno : data.keySet()) {
                System.out.println(data.get(enrno));
        }
    }
}