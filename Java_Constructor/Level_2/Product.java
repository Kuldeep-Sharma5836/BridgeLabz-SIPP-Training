import java.util.*;
public class Product {
    String productName;
    int price;
    static int totalproduct=0;
    Product(String productName,int price){
        this.price=price;
        this.productName=productName;
    }
    static void count(int totalproduct){
        totalproduct++;
    }
    void displayProductDetails(){
        System.out.println("Product name : "+productName);
        System.out.println("Price of product : "+price);
    }
    static void displayTotalProducts(){
        System.out.println("total products"+totalproduct);
    }
}
