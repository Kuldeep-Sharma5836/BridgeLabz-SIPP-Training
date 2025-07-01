class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    void performDuties() {
        System.out.println(name + " has general responsibilities.");
    }
}

class Chef extends Person {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }

    @Override
    void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes.");
    }
}

class Waiter extends Person {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tableCount);
    }

    @Override
    void performDuties() {
        System.out.println(name + " is serving " + tableCount + " tables.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Ravi", 201, "Indian");
        Waiter waiter = new Waiter("Amit", 202, 6);
        chef.displayInfo();
        chef.performDuties();
        waiter.displayInfo();
        waiter.performDuties();
    }
}
