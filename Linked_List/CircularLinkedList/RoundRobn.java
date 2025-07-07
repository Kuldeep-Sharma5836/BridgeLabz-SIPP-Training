import java.util.Scanner;
class task{
    int id;
    int burstTime;
    int priority;
    task next;
    task(int id, int burstTime, int priority,task next) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = next;
    }
}
public class RoundRobn {
    private task head;
    private task tail;

    public RoundRobn() {
        this.head = null;
        this.tail = null;
    }
    public void addTask(int id, int burstTime, int priority) {
        task newTask = new task(id, burstTime, priority, null);
        if (head == null) {
            head = newTask;
            tail = newTask;
            tail.next = head; 
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head; 
        }
    }
    public void removeTask(int id) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return;
        }
        task current = head;
        task previous = tail;
        do {
            if (current.id == id) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head; 
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head; 
                } else {
                    previous.next = current.next;
                }
                System.out.println("Task " + id + " removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
        System.out.println("Task " + id + " not found.");
    }
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        task current = head;
        do {
            System.out.println("Task ID: " + current.id + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RoundRobn roundRobin = new RoundRobn();
        System.out.println("Enter the number of tasks:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter task ID, Burst Time, and Priority for task " + (i + 1) + ":");
            int id = sc.nextInt();
            int burstTime = sc.nextInt();
            int priority = sc.nextInt();
            roundRobin.addTask(id, burstTime, priority);
        }
        System.out.println("Tasks in the Round Robin Scheduler:");
        roundRobin.displayTasks();
        System.out.println("Enter the ID of the task to remove:");
        int removeId = sc.nextInt();
        roundRobin.removeTask(removeId);
        System.out.println("Tasks after removal:");
        roundRobin.displayTasks();  
        
    }
}
