import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ExpenserManager {
    private ArrayList<Expenser> expensers = new ArrayList<>();
    private double monthlyBudget;

    public ExpenserManager(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;

    }

    public void addExpenser(Expenser expenser) {
        expensers.add(expenser);
    }

    public void removeExpenser(int index) {
        if (index >= 0 && index < expensers.size()) {
            expensers.remove(index);
        }
    }

    public void updateExpenser(int index, Expenser newExpenser) {
        if (index >= 0 && index < expensers.size()) {
            expensers.set(index, newExpenser);
        }
    }

    public ArrayList<Expenser> getExpensers() {
        return expensers;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }
}
