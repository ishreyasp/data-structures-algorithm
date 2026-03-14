class LinearSearch {

    public int linearSearch(int[] nums, int target) {
        int len = nums.length;

        for(int i=0; i<len; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] nums = {1, 6, 13, 64, 85};
        int target = 13;
        int result = ls.linearSearch(nums, target);
        System.out.println("Element found at index: " + result);
    }
}