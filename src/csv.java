import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class csv {

    public static void exportExpensesToCSV(List<Expenser> expenses, String fileName) {
        try (
                FileWriter fileWriter = new FileWriter(fileName);
                PrintWriter writer = new PrintWriter(fileWriter)
        ) {
            writer.println("Day,Month,Name,Value,Description,Mandatory");

            for (Expenser e : expenses) {
                writer.printf("%d,%d,%s,%.2f,%s,%s\n",
                        e.getDay(),
                        e.getMonth(),
                        e.getName(),
                        e.getValue(),
                        e.getDescription(),
                        e.isMandatory() ? "Sim" : "Não");
            }

            System.out.println("CSV file created successfully.");

        } catch (IOException ex) {
            System.out.println("Error writing CSV file: " + ex.getMessage());
        }
    }
}
