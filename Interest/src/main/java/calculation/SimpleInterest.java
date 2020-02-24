package calculation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest implements calculation {
    private Logger log= LogManager.getLogger(SimpleInterest.class);
    @Override
    public double calculate(double principle, double rateInPercent, double timeInYears) {
        log.info("Entered calcualte() in SimpleInterest ");
        try {
            double val = (principle * rateInPercent * timeInYears) / 100;
            log.info("succesfully completed calcualte() ");
            return val;

        } catch (Exception e) {
            log.error("Invalid input SimpleInterest ");
            e.printStackTrace();
        }
        return 0;
    }
}
