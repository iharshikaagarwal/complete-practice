//leet code
public class PracticeQuestion {
        public static void main (String [ ]args){
            int [ ]nums = {2,7,11,15};
            for (int i = 0 ; i < nums.length-1 ; i++){
                int sum = nums [ i ]+ nums[i+1];
                if (sum==9){
                    System.out.print(i+","+ (i+1));
                }

            }
        }

}
