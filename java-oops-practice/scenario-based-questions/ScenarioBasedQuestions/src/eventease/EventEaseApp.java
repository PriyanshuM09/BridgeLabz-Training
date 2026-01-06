package eventease;

public class EventEaseApp {

    public static void main(String[] args) {

        User user = new User("Priyanshu", "priyanshu@gmail.com", "9999999999");

        Event event1 = new BirthdayEvent(
                "Birthday Bash", "Delhi", "10-Apr-2026", 50,
                user, 3000, 2000
        );

        Event event2 = new ConferenceEvent(
                "Tech Conference", "Bangalore", "15-May-2026", 200,
                user, 10000, 5000
        );

        Event[] events = { event1, event2 };

        for (Event e : events) {
            e.schedule();   
            System.out.println("Event ID: " + e.getEventId());
            System.out.println("-----------------------");
        }
    }
}
