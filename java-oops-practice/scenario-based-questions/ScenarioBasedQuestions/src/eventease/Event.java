package eventease;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;   
    private double baseCost;     
    protected User organizer;

    private static int counter = 1000;

    // Constructor without services
    public Event(String eventName, String location, String date, int attendees, User organizer) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.baseCost = 5000;
        this.eventId = ++counter;
    }

    // Constructor with services
    public Event(String eventName, String location, String date, int attendees,
                 User organizer, double cateringCost, double decorationCost) {
        this(eventName, location, date, attendees, organizer);
        this.baseCost += cateringCost + decorationCost;
    }

    public int getEventId() {
        return eventId;
    }

    protected double calculateTotalCost(double discount) {
        return baseCost - discount; 
    }

    public abstract void schedule();
}
