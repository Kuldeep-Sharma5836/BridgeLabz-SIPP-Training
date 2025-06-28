import java.util.*;
public class CoffeeCounter{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Coldcoffee=200;
        int Espresso=300;
        int total=0;
        while(true){
            System.out.println("Welcome to the Coffee Counter!");
            System.out.println("please enter your choice:   ");
            String ch = sc.nextLine();
            ch = ch.toLowerCase();
            switch (ch) {
                case "espresso":
                    total += Espresso;
                    System.out.println("Order received for espresso coffee.");
                    System.out.println("Bill: " + (total * 0.18));
                    System.out.println();
                    break;
                case "capuccino":
                    total += Coldcoffee;    
                    System.out.println("Order received for capuccino coffee.");
                    System.out.println("Bill: " + (total * 0.18));
                    System.out.println();
                    break;
                case "exit":
                    System.out.println("Exiting the coffee counter.");  
                    return;
                default:
                    System.out.println("Invalid input! Please enter 'Hot' for hot coffee, 'Cold' for cold coffee, or 'Exit' to exit.");
                    break;
            }
        }
    }
}