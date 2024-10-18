import java.util.*;

public class bstbuilt {
    static class Node{
        int data ;
        Node left;
        Node right ;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if (root.data>val){
//            for left subtree
            root.left=insert(root.left,val);
        }
        else {
            root.right=insert(root.right,val);
        }
        return root;
    }
//    inorder isliye nikal kyuki are inorder traversing ke baad agar array sorted hai matlab bst hai 
    public static void inorder(Node root){
        if(root==null){
           return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean BSTsearching(Node root , int key){
        if (root==null){
            return false;
        }
        if(root.data>key){
//            move left
            return BSTsearching(root.left,key);
        } else if (root.data==key) {
            return true;
        }
        else  {
//            move left(root.data< key)
            return BSTsearching(root.right,key);
        }

    }
    public static void printInRange(Node root , int x , int y ){
        if(root==null){
            return;
        }
        if (root.data>=x && root.data<=y){
            printInRange(root.left,x,y);
            System.out.println(root.data+" ");
            printInRange(root.right,x,y);
        }
        else if (root.data>=y){
            printInRange(root.left,x,y);
        }
        else {
            //         (root.data<=x)

            printInRange(root.right,x,y);
        }
    }
    public static Node delete(Node root , int val){
        if(root.data>val){
            root.left =delete(root.left,val);

        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else {
//            root==val
//          case ::1
          if (root.left==null && root.right==null){
              return null;
          }
//          case ::2
          if (root.left==null){
              return root.right;
          } else if (root.right==null) {
              return root.left;
          }
//        case::3
          Node IS = inordersuccsor(root.right);
          root.data=IS.data;
//          idar deletebkarne wali node ko replace kiya inordersuccesor se
          root.right= delete(root.right ,IS .data);
//          alredy exists place of inordersuccesor ko delete kardiya


        }
        return root;
    }
    public static void printpath(ArrayList<Integer>path){
        for (int i = 0 ; i< path.size();i++){
            System.out.print(path.get(i)+" --> ");
        }
        System.out.println();
    }
    public static void rootToleaf(Node root , ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            printpath(path);
        }
        else {
            rootToleaf(root.left,path);
            rootToleaf(root.right ,path);
        }

        path.remove(path.size()-1);
    }
    public static Node inordersuccsor(Node root){
         while (root.left!=null){
             root=root.left;
         }
         return root;
    }
    public static void main(String[]args){
        int []values = {8,5,3,6,10,11,14};
        Node root = null;
        for (int i = 0 ; i< values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        if (BSTsearching(root,1)){
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }
//        delete(root,3);
//        inorder(root);
//        System.out.println();
//        printInRange(root,6,10);
        rootToleaf(root,new ArrayList<>());

    }
}

