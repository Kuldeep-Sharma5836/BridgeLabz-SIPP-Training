import java.util.*;
public class FriendsComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("  Age: ");
            ages[i] = sc.nextInt();
            System.out.print("  Height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex])
                youngestIndex = i;
            if (heights[i] > heights[tallestIndex])
                tallestIndex = i;
        }

        System.out.println("\nYoungest: " + names[youngestIndex] + " (" + ages[youngestIndex] + " years)");
        System.out.println("Tallest: " + names[tallestIndex] + " (" + heights[tallestIndex] + " cm)");

        sc.close();
    }
}
