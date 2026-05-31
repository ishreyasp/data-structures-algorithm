/**
Given the array nums consisting of 2n elements in the form [x1, x2, ..., xn, y1, y2, ..., yn].

Return the array in the form [x1, y1, x2, y2, ..., xn, yn].
 */
class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }
        return result;
    }    

    public static void main(String[] args) {
        ShuffleArray shuffleArray = new ShuffleArray();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffleArray.shuffle(nums, n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
