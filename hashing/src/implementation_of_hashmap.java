import java.util.ArrayList;
import java.util.LinkedList;

public class implementation_of_hashmap {
    static class HashMap<k,v>{
        public class Node{
            k key;
            v value;
            public Node(k key, v value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
//        n= number of nodes
        private  int N;
//        N= size of array
        private LinkedList<Node> bucket[];
       @SuppressWarnings("unchecked")
        public HashMap(){
//            array 4 size ka hai
            this.N=4;
//            array of linked list banan hai array ke blocks ko buckets bhi bole gai
            this.bucket= new LinkedList[4];
//            array index pe ek khali linked list print karni hai
            for (int i = 0 ; i<4;i++){
                this.bucket[i]=new LinkedList<>();
            }

        }
        private int hashfunction(k key){
//            bucket index retun karkai degga
            int bucketindx= key.hashCode();
//            hash function helps to return the int value at the replacement of any key value
            return  Math.abs(bucketindx)%N;
//            math.abs always return the positive values
//            reason of %N is we want the bucketindex in between 0 to N-1 so if we find the module by any numbet (N)
//            then the reminder will always come between 0 to that N
//            example

            
        }
        private  int  searchlinkedkist(k key , int bucketindx){
            LinkedList<Node> ll = bucket[bucketindx];
            for (int i =0 ; i<ll.size();i++){
                if (ll.get(i).key==key){
                    return i;
//i is wjat node index
                }
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void  rehash(){
            LinkedList<Node>oldbucket[]=bucket;
//            buckets ke sare linklist ko oldbucket me daal diya
            bucket=new LinkedList[N*2];
//            then new doubel array of linked list creat kardiya
            for (int i =0 ; i< N*2; i++){
                bucket[i]=new LinkedList<>();
            }
            for (int i =0 ; i<oldbucket.length;i++){
                LinkedList<Node>ll=oldbucket[i];
                for (int j = 0 ;j <ll.size();j++){
                    Node node  =ll.get(j);
                    put(node.key, node.value);
                }

            }
        }
        public void  put(k key , v value){
            int bucketindx = hashfunction(key);
//            bucket index mill geya uske baad us index pe jaake apan ko check
//            karna hai ki node exits karti hai ya nhi
            int nodeindx= searchlinkedkist(key,bucketindx);
//            nodeindx==-1 not exits
//            nodeindx ==0 to any value it means it exits
            if (nodeindx==-1){
//               exits nhi karta
                bucket[bucketindx].add(new Node(key,value));
                n++;
//                us bucket index pe jaake ek naya node add kare gai key value ka
            }
            else {
//                exits karta hai
                Node node = bucket[bucketindx].get(nodeindx);
//                us bucketindex pai us particlat data kai index pe jaaye gaui jha vo key exits karti  hai
                node.value=value;
//                vha jaake value update karde gai
            }
            double lamda =(double) n/N;
//            k=2.0(consatant)
            if (lamda>2.0){
                rehash();
            }

        }
        public v get(k key){
            int bucketindx = hashfunction(key);
            int nodeindx = searchlinkedkist(key, bucketindx); //di = -1
            if(nodeindx == -1) { //key doesn't exist
                return null;
            } else { //key exists
                Node node = bucket[bucketindx].get(nodeindx);
                return node.value;
            }
        }
        public boolean containskey(k key){
            int bucketindx = hashfunction(key);
            int nodeindx = searchlinkedkist(key, bucketindx); //di = -1
            if(nodeindx == -1) { //key doesn't exist
                return false;
            } else { //key exists

                return true ;
           }
        }
        public v remove(k key){
            int bucketindx = hashfunction(key);
            int nodeindx = searchlinkedkist(key, bucketindx); //di = -1
            if(nodeindx == -1) { //key doesn't exist
                return null;
            } else { //key exists
                Node node = bucket[bucketindx].remove(nodeindx);
                n--;
                return node.value;
            }
        }
        public boolean isEmpty(){
            return n==0;
        }
        public ArrayList<k> keyset(){
            ArrayList<k> key = new ArrayList<>();
            for (int i =0;i<bucket.length;i++){
                LinkedList<Node>ll=bucket[i];
                for (int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    key.add(node.key);
                }
            }
            return key;
        }



    }
    public static void main(String[]args){
        HashMap<String,Integer> map = new HashMap<>();
//        it is not an inbuilt class yeh vo class hai jo abhi upar banai hai apan nai
        map.put("india", 120);
        map.put("usa", 180);
        map.put("england", 120);
        map.put("china", 12);
        ArrayList<String> key = map.keyset();
        for(int i=0; i<key.size(); i++) {
            System.out.println(key.get(i)+" "+map.get(key.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
    }

    
}
