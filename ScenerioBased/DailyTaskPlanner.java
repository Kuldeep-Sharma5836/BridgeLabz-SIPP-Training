import java.util.LinkedList;

abstract class Task {
    String title;

    public Task(String title) {
        this.title = title;
    }

    abstract void execute();

    public String getTitle() {
        return title;
    }
}

class Meeting extends Task {
    String time;

    public Meeting(String title, String time) {
        super(title);
        this.time = time;
    }

    void execute() {
        System.out.println("Meeting: " + title + " at " + time);
    }
}

class Workout extends Task {
    int duration;

    public Workout(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    void execute() {
        System.out.println("Workout: " + title + " for " + duration + " mins");
    }
}

class CodingSession extends Task {
    String language;

    public CodingSession(String title, String language) {
        super(title);
        this.language = language;
    }

    void execute() {
        System.out.println("Coding Session: " + title + " using " + language);
    }
}

public class DailyTaskPlanner {
    LinkedList<Task> tasks = new LinkedList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void showAllTasks() {
        for (Task task : tasks) {
            task.execute();
        }
    }

    public void searchTask(String keyword) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                task.execute();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No task found with keyword: " + keyword);
        }
    }

    public static void main(String[] args) {
        DailyTaskPlanner planner = new DailyTaskPlanner();

        planner.addTask(new Meeting("Team Sync", "10:00 AM"));
        planner.addTask(new Workout("Morning Yoga", 30));
        planner.addTask(new CodingSession("Bug Fixing", "Java"));

        planner.showAllTasks();

        System.out.println("\nSearch result:");
        planner.searchTask("Yoga");
    }
}
