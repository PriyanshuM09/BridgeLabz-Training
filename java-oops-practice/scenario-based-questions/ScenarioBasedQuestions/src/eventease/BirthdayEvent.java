package eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date, int attendees, User organizer) {
        super(name, location, date, attendees, organizer);
    }

    public BirthdayEvent(String name, String location, String date, int attendees,
                         User organizer, double catering, double decoration) {
        super(name, location, date, attendees, organizer, catering, decoration);
    }

    public void schedule() {
        System.out.println(" Birthday Event scheduled for " + organizer.getName());
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday Event rescheduled to " + newDate);
    }

    public void cancel() {
        System.out.println("Birthday Event cancelled.");
    }
}
