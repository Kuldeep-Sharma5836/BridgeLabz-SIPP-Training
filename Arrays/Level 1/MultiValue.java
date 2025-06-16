import java.util.Scanner;
public class MultiValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=10;
        int a[]= new int[n];
        int i=0;
       
        while(i<n){
            int c= sc.nextInt();
            if(c<0 || c==0){
                break;
            }
            a[i]=c;
            i++;
        }
        for(int b=0;b<a.length;b++){
            System.out.println(a[b]);
        }
    }
}
