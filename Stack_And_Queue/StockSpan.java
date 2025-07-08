import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the stock prices for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        
        int[] span = calculateStockSpan(prices);
        
        System.out.println("Stock Span for each day: " + Arrays.toString(span));
    }
    static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1; 
            } else {
                span[i] = i - stack.peek(); 
            }
            stack.push(i); 
        }
        
        return span;
    }
}
