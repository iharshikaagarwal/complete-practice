import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[]args){
//        country(key)&& population(population)
        HashMap<String,Integer> map = new HashMap<>();
//        insert
        map.put("india", 120);
        map.put("usa", 180);
        map.put("england", 120);
        map.put("china", 12);
        System.out.println(map);
        map.put("china", 60);
//        if we re insert the value the value will be upadte from older one
        System.out.println(map);
//        searhing
        if (map.containsKey("china")){
            System.out.println("found");
        }
        if (map.containsValue(120)){
            System.out.println("found");
        }
//        getting
        System.out.println(map.get("china"));
//        if key exists
        System.out.println(map.get(("indonaisia")));
//        if not exits

//      Iterator
        for (Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("another way");
        Set<String>keys = map.keySet();
        for (String key : keys){
            System.out.println(key+" "+map.get(key));
        }
//      remove
        map.remove("china");
        System.out.println(map);






    }
}