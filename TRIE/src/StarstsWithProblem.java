public class StarstsWithProblem {
    static class Node{
        Node[]childern;
        boolean endofnode;
        //        we cna eirte this eow
        public Node(){
            childern=new Node[26];
            for (int i = 0 ; i < 26 ; i++){
                childern[i]=null;
            }
            endofnode=false;

        }

    }
    static Node root = new Node();
    public static void insert(String word){
        Node current = root;
        for (int i = 0 ;i < word.length();i++ ){
//            word ek har ek letter ko gtreverse kare gai
            int indx = word.charAt(i)-'a';
//            har letter ka index ninakal ne ka tarika
            if (current.childern[indx]==null){
//           are vo char childern node pe exits nhi karts hai
                current.childern[indx]=new Node();
//                toh neew  node bana do

            }
            if(i==word.length()-1){
//                are word ka end letter aa jaye toh yhe karo
                current.childern[indx].endofnode=true;
            }
//           exits karta ho toh kuch mat karo
            current= current.childern[indx];
        }
    }
    public static boolean search(String key ){
        Node current = root;
        for (int i = 0 ; i < key.length() ; i++){
            int indx = key.charAt(i)-'a';
            if(current.childern[indx]==null){
                return false;
            }
            if (i==key.length()-1 && current.childern[indx].endofnode==false){
                return false;
            }
            current=current.childern[indx];
        }
        return true;
    }
    public static boolean StartsWith(String prefix){
        Node curr = root;
        for (int i = 0 ; i <prefix.length();i++){
            int indx = prefix.charAt(i)-'a';
            if (curr.childern[indx]==null){
                return false;
            }
            curr=curr.childern[indx];
        }
        return true;

    }



    public static void main(String[] args) {
        String []words={"the","apple","there","their","any"};
        for (int  i =0; i<words.length ;i++) {
            insert(words[i]);
        }
//        System.out.println(search("thpor"));
//        System.out.println(search("any"));
//        System.out.println(search("an"));
        System.out.println(StartsWith("app"));
        System.out.println(StartsWith("moon"));

    }
}
