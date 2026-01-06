package eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date, int attendees, User organizer) {
        super(name, location, date, attendees, organizer);
    }

    public ConferenceEvent(String name, String location, String date, int attendees,
                           User organizer, double catering, double decoration) {
        super(name, location, date, attendees, organizer, catering, decoration);
    }

    public void schedule() {
        System.out.println(" Conference scheduled with speakers and agenda.");
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    public void cancel() {
        System.out.println("Conference Event cancelled.");
    }
}

