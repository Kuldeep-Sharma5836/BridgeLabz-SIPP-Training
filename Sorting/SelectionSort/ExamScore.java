import java.util.*;
public class ExamScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter exam scores:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }   
        System.out.println();
        selectionSort(arr);
        System.out.println("Array after sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex]; 
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}
