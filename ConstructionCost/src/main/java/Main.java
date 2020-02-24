import construction_cost.CostCalculation;
import construction_cost.CostCalculationimpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        String area;
        String sMaterial;
        String auto;
        Scanner scan = new Scanner(System.in);
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        streamWriter.write("Enter Material (normal or above or high ):\t");
        streamWriter.flush();
        sMaterial = scan.nextLine();
        streamWriter.write("Enter automatic ( fully or no ) :\t");
        streamWriter.flush();
        auto = scan.nextLine();
        streamWriter.write("Enter area :\t");
        streamWriter.flush();
        area = scan.next();
        streamWriter.write("Total cost :\t");
        CostCalculation cal = new CostCalculationimpl();
        streamWriter.write(String.valueOf(cal.calculateCost(area, sMaterial, auto)) + "INR");
        streamWriter.flush();
    }
}
