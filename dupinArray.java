public class dupinArray {
    public boolean containsDuplicate(int[] nums) {
        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length; y++) { // Avoid unnecessary comparisons
                if (nums[x] == nums[y]) { // Comparison operator
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates
    }
    public static void main(String[] args) {
        int nums[]={1,3,6,4,3};
        dupinArray obj=new dupinArray();
        boolean k =obj.containsDuplicate(nums);
        if(k==true)
        System.out.println(true);
        else
        System.out.println(false);
    }
}
