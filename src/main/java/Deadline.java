public class Deadline extends Task {

    protected String timing;

    public Deadline(String description, String by) {
        super(description);
        this.timing = by;
    }

    public String getIcon() {
        return "[D]";
    }

    public String getTiming() {
        return "(by:" + timing + ")";
    }

    @Override
    public String toString() {
        return getIcon() + super.toString() + getTiming();
    }
}