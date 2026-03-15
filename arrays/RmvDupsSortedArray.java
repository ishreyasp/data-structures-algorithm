class RmvDupsSortedArray {

    public int removeDuplicates(int[] nums) {
        int index = 0;
       for(int i=1; i<nums.length; i++){
            if(nums[index] < nums[i]){
                index++;
                nums[index] = nums[i];
            }
       }
       return index+1;
    }

    public static void main(String[] args) {
        RmvDupsSortedArray r = new RmvDupsSortedArray();
        int[] nums = {1,1,2};
        System.out.println(r.removeDuplicates(nums));
    }
}