import java.util.*;
public class ProfitLoss{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int costPrice = sc.nextInt();
        int sellingPrice = sc.nextInt();
        int profit= sellingPrice - costPrice;
        int profitPercentage = (profit * 100) / costPrice;
        System.out.println("The Cost Price is INR "+costPrice+"and Selling Price is INR "+sellingPrice);
        System.out.println("Profit is INR " + profit + " and Profit Percentage is " + profitPercentage + "%");
    }
}