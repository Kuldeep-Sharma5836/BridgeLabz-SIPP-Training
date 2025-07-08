import java.util.*;
public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the size of the sliding window:");
        int k = sc.nextInt();
        
        List<Integer> result = maxSlidingWindow(arr, k);
        
        System.out.println("Maximums in each sliding window: " + result);
    }
    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0 || k <= 0) {
            return result;
        }
        
        Deque<Integer> deque = new ArrayDeque<>();
        int i=0;
        for(;i<k;i++){
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        result.add(nums[deque.peekFirst()]);
        for(;i<nums.length;i++){
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if(deque.peekFirst() <= i-k){
                deque.pollFirst();
            }
            result.add(nums[deque.peekFirst()]);
        }
        return result;
    }
}
