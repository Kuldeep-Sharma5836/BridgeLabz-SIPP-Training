import java.util.*;
public class SortAnStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the number of elements in the stack:");
        int n = sc.nextInt();   
        System.out.println("Enter the elements of the stack:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);

    }
    static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, temp);
        }
    }

    static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            insertInSortedOrder(stack, element); 
            stack.push(temp); 
        }
    }
}
