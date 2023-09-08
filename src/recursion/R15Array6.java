package recursion;

public class R15Array6 {
    //array6([1, 6, 4], 0) → true
    //array6([1, 4], 0) → false
    //If the array contains 6 from the given index then true.

    public static boolean array6(int[] nums, int index) {
        //Base Condition
        if (index == nums.length) {
            return false;
        }

        //Recursive Function
        if (nums[index] == 6) {
            return true;
        }
        //return array6(nums,index++); When doing ++ it is giving error.
        return array6(nums, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,8,4,55,6,77,8,8};
        System.out.println(array6(nums,0));
    }
}