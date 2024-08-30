import java.util.Arrays;
class Main {
    
    public static int[] removeD(int[] nums) {
        for (int i = nums.length-1;i>=0; i--) {
            if (nums[i]== 9) {
                nums[i]=0; 
            }else{
                nums[i]++;
                return nums;
            }
        } nums=new int[nums.length+1];
        nums[0]=1;
        return nums;
    }
    
    public static void main(String[] args) {
  int[] nums = {9,9}; 
    int [] ans =removeD(nums); 
    System.out.println(Arrays.toString(ans));
    }
}
