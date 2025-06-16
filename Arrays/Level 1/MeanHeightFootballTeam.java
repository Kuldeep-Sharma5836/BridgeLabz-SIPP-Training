import java.util.Scanner;
public class  MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=11;
        int [] heights = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            heights[i] = sc.nextInt();
            sum += heights[i];
        }   
        double average = (double) sum / n;
        System.out.printf("The mean height of the football team is "+ average);
    }    
}