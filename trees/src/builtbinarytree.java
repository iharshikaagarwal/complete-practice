import java.util.*;
public class builtbinarytree {



        static class node{
            int data;
            node left;
            node right;
            node (int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        static class binarytree {
            static int indx = -1;
            public  static node bulittree(int node[]){
                indx++;
                if (node[indx]==-1){
                    return null;
                }
                node newnode = new node(node[indx]);
                newnode.left=bulittree(node);
                newnode.right=bulittree(node);
                return newnode;


            }


        }
        //    in preorder first root then left then right
        public static void preordertraversing(node root ){
            if (root==null){
                return;
            }
            System.out.println(root.data+" ");
            preordertraversing(root.left);
            preordertraversing(root.right);

        }
        public static void inordertraversing(node root){
            if(root==null){
                return;
            }
            inordertraversing(root.left);
            System.out.println(root.data+" ");
            inordertraversing(root.right);

        }
        public static void postordertraversing(node root){
            if(root==null){
                return;
            }
            postordertraversing(root.left);
            postordertraversing(root.right);
            System.out.println(root.data+" ");
        }
        public static void levelOrder(node root) {
            if(root == null) {
                return;
            }
            Queue<node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()) {
                node curr = q.remove();
                if(curr == null) {
                    System.out.println();
                    //queue empty
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data+" ");
                    if(curr.left != null) {
                        q.add(curr.left);
                    }
                    if(curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }
        public static int countnodes(node root){
            if(root==null){
                return 0 ;
            }
            int lefnode = countnodes(root.left);
            int rightnode = countnodes(root.right);
            return lefnode+ rightnode+1;
        }
        public static int sumofnodes(node root){
            if(root==null){
                return 0;
            }
            int leftsum = sumofnodes(root.left);
            int rightsum = sumofnodes(root.right);
            return leftsum+ rightsum+ root.data;
        }

        public static int height (node root){
            if(root==null){
                return 0;
            }
            int leftheight = height(root.left);
            int rightheight = height(root.right);
            int mytreeheight = Math.max(leftheight,rightheight)+1;
            return mytreeheight;
        }
        //    this daimeter code give an complexcity O(n^2)
        public static int daimeter(node root){
            if(root==null){
                return 0;
            }
            int  D1= daimeter(root.left);
            int D2 = daimeter(root.left);
            int D3 =   height(root.left)+ height(root.right)+1;

            return Math .max(D3, Math .max( D2,D3));
        }
        //     the new complexcity
        static  class treeinfo{
            int ht;
            int daimeter;
            treeinfo(int ht , int daimeter){
                this.ht=ht;
                this.daimeter=daimeter;
            }
        }
        public static treeinfo daimetercalculation (node root){
            if (root==null){
                return new treeinfo(0,0);
            }
            treeinfo left = daimetercalculation(root.left);
            treeinfo right = daimetercalculation(root.right);
            int myheight = Math.max(left.ht,right.ht)+1;
            int dai1= left.daimeter;
            int dai2 = right.daimeter;
            int dai3 = left.ht+right.ht+1;
            int mydaimeter = Math.max(Math.max(dai1,dai2),dai3);
            treeinfo myinfo = new treeinfo(myheight,mydaimeter);
            return myinfo;

        }
        //    subtree of another tree
        public static boolean issubtree(node root , node subroot){
            if(subroot==null){
                return true;
            }
            if(root==null){
                return false;
            }
            if (root.data==subroot.data){
//            we are making an another function
//            for checking left rigt
                if(isidentical(root,subroot)){
                    return true;
                }

            }
            return issubtree(root.left ,subroot)||issubtree(root.right,subroot);

        }
        public static boolean isidentical(node root , node subroot){
            if (root==null && subroot==null){
                return true;
            }
            if (root==null||subroot==null){
                return false;
            }
            return isidentical(root.left,subroot)&& isidentical(root.right,subroot);


        }



        public static void main(String[]args){
            int nodes[] = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            binarytree tree = new binarytree();
            node root = tree.bulittree(nodes);
//        System.out.println(root.data);
            System.out.println("the preorder series of traversing");
            preordertraversing(root);
            System.out.println("the inorder series of traversing");
            inordertraversing(root);
            System.out.println("the postorder series of traversing");
            postordertraversing(root);
            System.out.println("the level order series of traversing");
            levelOrder(root);
            System.out.println("the total count of thr tree nodes is ");
            System.out.println(countnodes(root));
            System.out.println("the sum of all nodes are "+ sumofnodes(root));
            System.out.println(" the height of tree "+height(root));
//        System.out.println("the daimeter of tree"+daimeter(root));
            System.out.println("the daimeter"+daimetercalculation(root).daimeter);




        }


}
