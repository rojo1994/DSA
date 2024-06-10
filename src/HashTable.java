import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        Hashtable<String, String> table = new Hashtable<>(10);

        table.put("100", "Spongebob");
        table.put("123", "Ptrick");
        table.put("321", "Squidward");
        table.put("555", "Sandy");
        table.put("777", "Gary");

//        table.remove(777);

        for (String key: table.keySet()){
            System.out.println( key.hashCode() % 10+"\t"+key + "\t" + table.get(key));
        }






    }
}
