public class Mandatory extends Expenser {
    public Mandatory(int day, int month, String name, double value, String description) {
        super(day, month, name, value, description, true);
    }
}
