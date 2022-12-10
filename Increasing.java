import java.util.ArrayList;

public class Increasing {
    public int[] getIncreasing(int[] numbers) {
      ArrayList<Integer> nums = new ArrayList<>(); 
     
      nums.add(numbers[0]);
      for(int i = 1; i<numbers.length; i++){
        int temp = nums.get(nums.size()-1);
        if(temp<numbers[i]){
            nums.add(numbers[i]);
        }
      }

      int[] ans = new int[nums.size()];

      for(int i = 0; i < ans.length; i++){
        ans[i] = nums.get(i);
      }
      return ans; 
    }
}