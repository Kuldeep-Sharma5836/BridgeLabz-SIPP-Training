import java.util.Scanner;
public class TableUserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n>=6 && n<=9){
            int[] table = new int[10];
            for(int i=0; i<10; i++) {
                table[i] = n * (i + 1);
            }
            for(int i=0; i<10; i++) {
                System.out.println(n + " * " + (i + 1) + " = " + table[i]);
            }
        } else {
            System.out.println("Please enter a number between 6 and 9.");
        }
    }
}
