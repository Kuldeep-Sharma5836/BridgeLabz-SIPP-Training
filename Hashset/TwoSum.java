import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element  ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        int[] result = twoSum(arr, target);

        if (result[0] != -1)
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        else
            System.out.println("No valid pair found.");
    }
}
