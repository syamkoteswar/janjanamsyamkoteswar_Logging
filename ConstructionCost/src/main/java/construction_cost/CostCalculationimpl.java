package construction_cost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class CostCalculationimpl implements CostCalculation {

    private OutputStreamWriter streamWriter;
    //private static final Logger log = LogManager.getLogger("CostCalculationimpl.class");
    private final Logger log = LogManager.getLogger(this.getClass().getName());

    public CostCalculationimpl() {
        log.info("CostCalculationimpl constructor is called");
        streamWriter = new OutputStreamWriter(System.out);
        log.info("Exited CostCalculationimpl constructor");
    }

    @Override
    public double calculateCost(String area, String choiceMaterial, String choiceAutomation) throws IOException {
        log.info("Entered calculateCost() ");
        String s = "";
        s = s + choiceMaterial + " standard materials " + choiceAutomation;
        double val = 0;
        double a=0;
        try {
            a=Double.valueOf(area);
            val = MY_MAP.get(s) * a;
            log.info("Exit from calculateCost() ");
        } catch (Exception e) {
           streamWriter.write("Invalid input");
           streamWriter.flush();
           log.error("Invalid input");
        }
        return val;
    }

}
