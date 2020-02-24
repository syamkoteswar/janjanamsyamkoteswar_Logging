package calculation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest implements calculation {
    private Logger log= LogManager.getLogger(CompoundInterest.class);
    @Override
    public double calculate(double principle, double rateInPercent, double timeInYears) {
        log.info("Entered calcualte() in CompoundInterest");
        try {
            double val= principle * (Math.pow(1 + rateInPercent / 100, timeInYears) - 1);
            log.info("succesfully completed calcualte() in  Compound Interest ");
            return val;
        } catch (Exception e) {
            log.error("Invalid input ");
            e.printStackTrace();
        }
        return 0;
    }
}
