import java.util.*;
public class FoodFest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Food Item Names :");
        String [] foodItemName=new String[n];
        for(int i=0;i<n;i++){
            foodItemName[i]=sc.next();
        }
        System.out.println("Enter Food Item Prices :");
        double[] foodItemPrice=new double[n];
        for(int i=0;i<n;i++){
            foodItemPrice[i]=sc.nextDouble();
        }
        Merge(foodItemName, foodItemPrice,0,n-1);
    }
    public static void Merge(String [] foodItemName, double[] foodItemPrice, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            Merge(foodItemName, foodItemPrice, left, mid);
            Merge(foodItemName, foodItemPrice, mid + 1, right);
            merge(foodItemName, foodItemPrice, left, mid, right);
        }
        System.out.println("Food Item Names and Prices:");
        for(int i=0;i<foodItemName.length;i++){
            System.out.println(foodItemName[i]+" "+foodItemPrice[i]);
        }
    }
    public static void merge(String[] foodItemName, double[] foodItemPrice, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] LName = new String[n1];
        double[] LPrice = new double[n1];
        String[] RName = new String[n2];
        double[] RPrice = new double[n2];

        for (int i = 0; i < n1; i++) {
            LName[i] = foodItemName[left + i];
            LPrice[i] = foodItemPrice[left + i];
        }
        for (int j = 0; j < n2; j++) {
            RName[j] = foodItemName[mid + 1 + j];
            RPrice[j] = foodItemPrice[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (LPrice[i] <= RPrice[j]) {
                foodItemName[k] = LName[i];
                foodItemPrice[k] = LPrice[i];
                i++;
            } else {
                foodItemName[k] = RName[j];
                foodItemPrice[k] = RPrice[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            foodItemName[k] = LName[i];
            foodItemPrice[k] = LPrice[i];
            i++;
            k++;
        }

        while (j < n2) {
            foodItemName[k] = RName[j];
            foodItemPrice[k] = RPrice[j];
            j++;
            k++;
        }
    }
}
