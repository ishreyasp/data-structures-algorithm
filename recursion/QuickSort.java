class QuickSort {
    public void quickSort(int[] nums, int low, int high) {
        if(low < high) {
            int pivot_idx = partition(nums, low, high);
            quickSort(nums, low, pivot_idx - 1);
            quickSort(nums, pivot_idx + 1, high);
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] nums = {3, 6, 8, 10, 1, 2, 1};
        qs.quickSort(nums, 0, nums.length - 1);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}