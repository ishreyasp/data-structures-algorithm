class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int ptr = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = re.removeElement(nums, val);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}