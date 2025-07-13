
import java.util.*;
public class Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        int low=0;
        int high=n-1;
        while(low<high){
            for(int i=0;i<n;i++){

            
            int mid=(low+high)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else if(arr[mid]<high){
                high=mid;
            
            }else{
                arr[i]=mid;
            }
        }
    }
        System.out.println(low + " is the rotation point.");


    }
}
