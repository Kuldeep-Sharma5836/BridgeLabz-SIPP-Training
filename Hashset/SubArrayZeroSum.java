import java.util.*;
public class SubArrayZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = subarray(arr);
        System.out.println("Number of subarrays with zero sum: " + count);
    }
    public static int subarray(int a[]){
        int c=0;
        int s=0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        for(int i=0; i<a.length; i++){
            s += a[i]; 
            if(map.containsKey(s)){
                
                c += map.get(s); 
                map.put(s, map.get(s) + 1); 
            } else {
                map.put(s, 1); 
            }
        }
        return c;
    }
}
