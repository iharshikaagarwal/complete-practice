
import java.util.HashMap;


public class Iternery_from_tickets {
    public static String getstarted (HashMap<String,String>tick){
        HashMap<String,String> revMap = new HashMap<>();
        for (String Key : tick.keySet()){
            String value = tick.get(Key);
//             key -->>key && value -->> tick.get(key)
            revMap.put(value,Key);

        }
        for (String key : tick.keySet()){
            if(!revMap.containsKey(key)){
//              key   revermap ke andar ki key me nhi hai the return that key
                return key;
//                that is an start key
//
            }


        }
        return  null;

    }
    public static void main(String []args){
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("chennai","bengaluru");
        tickets.put("mumbai","delhi");
        tickets.put("goa","chennai");
        tickets.put("delhi","goa");
        String start = getstarted(tickets);
        while(tickets.containsKey(start)){
            System.out.print(start + "->");
            start=tickets.get(start);

        }
        System.out.println(start);


    }
}
