import java.util.*; 
public class AvgPCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Math=sc.nextInt();
        int Physics=sc.nextInt();
        int Chemistry=sc.nextInt();
        int Average=(Math+Physics+Chemistry)/3;
        System.out.println("Sam's Average marks in PCM is " + Average);
    }
}
