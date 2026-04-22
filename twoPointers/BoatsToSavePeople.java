import java.util.Arrays;

/**
You are given an integer array people where people[i] is the weight of the ith person, 
and an infinite number of boats where each boat can carry a maximum weight of limit. 
Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

Example 1:
Input: people = [5,1,4,2], limit = 6
Output: 2
Explanation:
First boat [5,1].
Second boat [4,2].
 */
class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }

        return boats;
    }

    public static void main(String[] args) {
        BoatsToSavePeople solution = new BoatsToSavePeople();
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        int result = solution.numRescueBoats(people, limit);
        System.out.println("Minimum number of boats required: " + result);
    }
}
