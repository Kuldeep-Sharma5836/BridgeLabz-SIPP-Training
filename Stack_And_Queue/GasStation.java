import java.util.*;
public class GasStation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of gas stations:");
        int n = sc.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];
        
        System.out.println("Enter the amount of gas at each station:");
        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }
        
        System.out.println("Enter the cost to travel from each station:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        
        int startIndex = canCompleteCircle(gas, cost);
        
        if (startIndex == -1) {
            System.out.println("It is not possible to complete the circuit.");
        } else {
            System.out.println("You can start at station: " + startIndex);
        }
    }    
    public static int canCompleteCircle(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, currentGas = 0, startIndex = 0;
        
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];
            
            if (currentGas < 0) {
                startIndex = i + 1; 
                currentGas = 0; 
            }
        }
        
        return (totalGas >= totalCost) ? startIndex : -1; 
    }
}
