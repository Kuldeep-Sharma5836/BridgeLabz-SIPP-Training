import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int[] ages = new int[n];
        for(int i=0; i<n; i++) {
            ages[i] = sc.nextInt();
        }
        for(int i=0;i<ages.length;i++){
            if(ages[i]>=18){
                System.out.println("You can vote ");
            }else if(ages[i]<0){
                System.out.println("Invalid age" );
            }else{
                System.out.println("You can not vote");
            }
        }
    }
}
