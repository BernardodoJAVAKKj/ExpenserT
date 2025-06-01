public class Expenser {

    private int day;
    private int month;
    private String name;
    private double value;
    private String description;
    private boolean mandatory;

    public Expenser(int day, int month, String name, double value, String description, boolean mandatory) {
        this.day = day;
        this.month = month;
        this.name = name;
        this.value = value;
        this.description = description;
        this.mandatory = mandatory;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    @Override
    public String toString() {
        return name + " ($" + value + ") on " + day + "/" + month + " - " + description +
                (mandatory ? " [Mandatory]" : " [Optional]");
    }
}
