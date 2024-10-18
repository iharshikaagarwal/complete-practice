public class word_break_problem {
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
    public static boolean wordBreak(String key){
        if (key.length()==0){
            return true;
        }
        if (search(key)){
            return true;
        }
        for (int i = 1 ;  i<key.length();i++){
            String firstpart = key.substring(0,i);
            String secondpart =key.substring(i);
            if (search(firstpart) && wordBreak(secondpart)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        String []words={"i","like","samsung","sam","mobile"};
        String key="ilikesamsung";
        for (int i =0 ; i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(wordBreak(key));


    }
}
