import java.util.Scanner;
public class CheckPositiveNegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=5;
        int a[]= new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>0){
                if(a[i]%2==0){
                    System.out.println(a[i] + " is a positive even number");
                } else {
                    System.out.println(a[i] + " is a positive odd number");
                }
            }
            else if(a[i]<0){
                System.out.println(a[i] + " is a negative number");
            }else{
                System.out.println(a[i] + " is zero");
            }
        }
        if(a[0]>a[n-1]){
            System.out.println("The first element is greater than the last element.");
        } else if(a[0]<a[n-1]){
            System.out.println("The first element is less than the last element.");
        } else {
            System.out.println("The first element is equal to the last element.");
        }
    }
}
