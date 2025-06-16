import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int odd[]= new int[n];
        int even[]= new int[n];
        int k=0;
        int c=0;
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if(num % 2 == 0) {
                even[c++] = num;
            } else {
                odd[k++] = num;
            }
        }
        for(int i=0;i<k;i++){
            System.out.println("Odd number: " + odd[i]);
        }
        System.out.println("-----------------");
        for(int i=0;i<c;i++){
            System.out.println("Even number: " + even[i]);
        }
    }
}
