import java.util.HashMap;

public class Majority_element_hashmap {
    public static void majority_element(int []nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0 ; i < n ; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i], 1);
            }
        }
        for (int key : map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[]args){
        System.out.println("for  {1,3,2,5,1,3,1,5,1}");
        int[] nums= {1,3,2,5,1,3,1,5,1};
        majority_element(nums);
        System.out.println("for int[]n={1,2};");
        int[]n={1,2};
        majority_element(n);
    }
}
