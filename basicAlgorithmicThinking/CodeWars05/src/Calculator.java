/**
 * Created by almasics on 2017.02.07..
 */
public class Calculator {
    private float lossPercentage;
    private int oldCarPrice;
    private int newCarPrice;
    private int months = 0;

    public Calculator(float lossPercentage, int oldCarPrice, int newCarPrice) {
        this.lossPercentage = lossPercentage;
        this.oldCarPrice = oldCarPrice;
        this.newCarPrice = newCarPrice;
    }

    public Result calculate() {


        int monthlySavings = 1000;
        int savings = oldCarPrice + getCurrentSavings(months, monthlySavings);
        float sufficit = savings - newCarPrice;

        while (savings < newCarPrice) {

            months++;
            if (months % 2 == 0 && months != 0) {
                lossPercentage += 0.005f;
            }
            newCarPrice = calculateCarPrice(newCarPrice, lossPercentage);
            oldCarPrice = calculateCarPrice(oldCarPrice, lossPercentage);
            savings = oldCarPrice + getCurrentSavings(months, monthlySavings);
            sufficit = savings - newCarPrice;
        }

        return new Result(months, sufficit);
    }

    private int calculateCarPrice(int currentCarPrice, float lossPercentage) {
        return Math.round(currentCarPrice * (1 - lossPercentage));
    }

    private int getCurrentSavings(int months, int monthlySavings) {
        return months * monthlySavings;
    }
}
