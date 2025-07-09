import java.util.*;
public class PairTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();
        findPairs(arr, target);
    }
    public static void findPairs(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                found = true;
            }
            set.add(num);
        }
        
        if (!found) {
            System.out.println("No pairs found with the target sum " + target);
        }
    }
}
