import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap <String, String> hashMap = new HashMap();
        hashMap.put("Bangladesh", "Dhaka");
        hashMap.put("India", "Delhi");
        hashMap.put("Japan", "Tokiyo");

        System.out.println(hashMap.get("India"));



    }
}
