import java.util.*;

class Attendee {
    String name;
    int age;
    String email;

    public Attendee(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = null;
    }

    public Attendee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

class EventTicketingSystem {
    HashMap<String, Queue<Attendee>> eventMap;

    public EventTicketingSystem() {
        eventMap = new HashMap<>();
    }

    public void bookTicket(String eventName, Attendee attendee) {
        eventMap.putIfAbsent(eventName, new LinkedList<>());
        eventMap.get(eventName).offer(attendee);
    }

    public int getPosition(String eventName, String personName) {
        Queue<Attendee> queue = eventMap.get(eventName);
        if (queue == null) return -1;

        int position = 1;
        for (Attendee attendee : queue) {
            if (attendee.name.equals(personName)) {
                return position;
            }
            position++;
        }
        return -1;
    }
}

public class Event {
    public static void main(String[] args) {
        EventTicketingSystem system = new EventTicketingSystem();

        system.bookTicket("RockConcert", new Attendee("Alice", 25));
        system.bookTicket("RockConcert", new Attendee("Bob", 30, "bob@example.com"));
        system.bookTicket("RockConcert", new Attendee("Charlie", 22));

        int pos = system.getPosition("RockConcert", "Bob");
        System.out.println("Bob's position in RockConcert queue: " + pos);
    }
}
