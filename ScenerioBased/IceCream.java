import java.util.*;
public class IceCream{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] flavors = {"Vanilla", "Chocolate", "Strawberry", "Mint", "Cookie ","Dark Chocolate","Mango","Blueberry"};
        int sale[]=new int[flavors.length];
        for(int i=0;i<flavors.length;i++){
            sale[i]=sc.nextInt();
        }
        System.out.println("Ice Cream Flavors and Sales:");
        bubbleSort(flavors,sale);
    }
    public static void bubbleSort(String[] flavors, int[] sale) {
        int n = sale.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sale[j] > sale[j + 1]) {
                    int tempSale = sale[j];
                    sale[j] = sale[j + 1];
                    sale[j + 1] = tempSale;
                    String tempFlavor = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempFlavor;
                }
            }
        }
        for(int i=0;i<flavors.length;i++){
            System.out.println(flavors[i]+" "+sale[i]);
        }
    }
}