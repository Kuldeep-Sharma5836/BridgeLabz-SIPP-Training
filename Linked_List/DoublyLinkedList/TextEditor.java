import java.util.Scanner;
class text{
    String text;
    text next;
    text prev;
    text(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}
public class TextEditor {
    private text head;
    private text curr;

    public TextEditor() {
        this.head = null;
        this.curr = null;
    }
    public void insert(String text) {
        text newText = new text(text);
        if (head == null) {
            head = newText;
            curr = head;
        } else {
           curr.next = newText;
            newText.prev = curr;
            curr = newText;
        }
    }
    public void redo(){
        if (curr == null || curr.next == null) {
            System.out.println("Cannot redo.");
            return;
        }
        curr = curr.next;
        System.out.println("Redo performed.");
    }
    public void undo() {
        if (curr == null || curr.prev == null) {
            System.out.println("Cannot undo.");
            return;
        }
        curr = curr.prev;
        System.out.println("Undo performed.");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TextEditor editor = new TextEditor();
        while (true) {
            System.out.println("\n--- Text Editor Menu ---");
            System.out.println("1. Type/Add Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Show Current Text");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter text to add: ");
                    String text = sc.nextLine();
                    editor.insert(text);
                    break;
                case 2:
                    editor.undo();
                    break;
                case 3:
                    editor.redo();
                    break;
                case 4:
                    if (editor.curr != null) {
                        System.out.println("Current Text: " + editor.curr.text);
                    } else {
                        System.out.println("No text available.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
    }
}
