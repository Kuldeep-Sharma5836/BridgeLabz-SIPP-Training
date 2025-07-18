interface EventManager {
    void modifyEvent(Event event, String newTitle);
    void removeEvent(Event event);
}

class Event {
    String title;
    String date;

    public Event(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public void displayEvent() {
        System.out.println("Event: " + title + " on " + date);
    }
}

class Ticket {
    User user;
    Event event;

    public Ticket(User user, Event event) {
        this.user = user;
        this.event = event;
        System.out.println("Ticket issued to " + user.name + " for event " + event.title);
    }
}

class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Ticket registerForEvent(Event event) {
        return new Ticket(this, event);
    }
}

class Admin implements EventManager {
    public void modifyEvent(Event event, String newTitle) {
        System.out.println("Event '" + event.title + "' modified to '" + newTitle + "'");
        event.title = newTitle;
    }

    public void removeEvent(Event event) {
        System.out.println("Event '" + event.title + "' removed.");
    }
}

public class EventHiveApp {
    public static void main(String[] args) {
        Event e1 = new Event("AI Conference", "2025-08-10");
        User u1 = new User("Kuldeep", "kuldeep@email.com");
        Admin admin = new Admin();

        e1.displayEvent();
        Ticket t1 = u1.registerForEvent(e1);
        admin.modifyEvent(e1, "Advanced AI Summit");
        admin.removeEvent(e1);
    }
}
