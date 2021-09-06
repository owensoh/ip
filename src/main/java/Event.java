/**
 * This represents the subclass Event under superclass Task in each element of Task[] list in Duke.java.
 */
public class Event extends Task {

    protected String at;

    /**
     * This function initialises the deadline.
     *
     * @param description description input by user.
     * @param at date of event
     */
    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    /**
     * This function modifies the output format.
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at + ")";
    }
}