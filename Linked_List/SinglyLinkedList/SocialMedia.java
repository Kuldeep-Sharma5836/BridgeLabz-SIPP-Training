import java.util.*;
class user{
    String name;
    int userId;
    int age;
    List<String> friends;
    user next;
    public user(String name, int userId, int age, List<String> friends) {
        this.name = name;
        this.userId = userId;
        this.age = age;
        this.friends = friends;
        this.next = null;
    }
}
public class SocialMedia {
    private user head;
    public SocialMedia() {
        this.head = null;
    }
    public void addUser(String name, int userId, int age, List<String> friends) {
        user newUser = new user(name, userId, age, friends);
        if (head == null) {
            head = newUser;
        } else {
            user current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
    }
    public void displayUsers() {
        user current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", User ID: " + current.userId + ", Age: " + current.age + ", Friends: " + current.friends);
            current = current.next;
        }
    }
    public void deleteUser(int userId) {
        if (head == null) return;
        if (head.userId == userId) {
            head = head.next;
            return;
        }
        user current = head;
        while (current.next != null && current.next.userId != userId) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    public user searchUser(int userId) {
        user current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null; 
    }
    public void updateUser(int userId, String newName, int newAge, List<String> newFriends) {
        user current = head;
        while (current != null) {
            if (current.userId == userId) {
                current.name = newName;
                current.age = newAge;
                current.friends = newFriends;
                return;
            }
            current = current.next;
        }
    }
    public void countUsers() {
        int count = 0;
        user current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Total number of users: " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SocialMedia sm = new SocialMedia();
        while (true) {
            System.out.println("1. Add User");
            System.out.println("2. Display Users");
            System.out.println("3. Delete User");
            System.out.println("4. Search User");
            System.out.println("5. Update User");
            System.out.println("6. Count Users");
            System.out.println("7. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Friends (comma separated): ");
                    String friendsInput = sc.nextLine();
                    List<String> friends = Arrays.asList(friendsInput.split(","));
                    sm.addUser(name, userId, age, friends);
                    break;
                case 2:
                    sm.displayUsers();
                    break;
                case 3:
                    System.out.print("Enter User ID to delete: ");
                    int deleteId = sc.nextInt();
                    sm.deleteUser(deleteId);
                    break;
                case 4:
                    System.out.print("Enter User ID to search: ");
                    int searchId = sc.nextInt();
                    user foundUser = sm.searchUser(searchId);
                    if (foundUser != null) {
                        System.out.println("Found User: " + foundUser.name);
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter User ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Friends (comma separated): ");
                    String newFriendsInput = sc.nextLine();
                    List<String> newFriendsList = Arrays.asList(newFriendsInput.split(","));
                    sm.updateUser(updateId, newName, newAge, newFriendsList);
                    break;
                case 6:
                    sm.countUsers();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
}
