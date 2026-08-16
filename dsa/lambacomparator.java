import java.util.*;

class Task {
    private String taskName;
    private int priorityLevel;

    public Task(String name, int plevel) {
        this.taskName = name;
        this.priorityLevel = plevel;
    }

    public int getpriorityLevel () {
        return priorityLevel;
    }

    public String gettaskName () {
        return taskName;
    }

}

public class lambacomparator {
    public static void main(String[] args) {

        PriorityQueue<Task> pq = new PriorityQueue<>(
            (t1, t2) -> Integer.compare(t1.getpriorityLevel(), t2.getpriorityLevel())
        );

        pq.add(new Task("Write Docs", 3));
        pq.add(new Task("Check Email", 1));
        pq.add(new Task("Fix Production Bug", 10));

        System.out.println(pq.poll().gettaskName());

    
        
    }
}
