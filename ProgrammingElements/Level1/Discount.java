import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int fee= 125000;
        int discountPercent= 10;
        int discount= (fee * discountPercent) / 100;
        int finalFee = fee - discount;
        System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR "+ finalFee);
    }    
}
