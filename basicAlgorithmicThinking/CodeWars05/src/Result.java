/**
 * Created by almasics on 2017.02.07..
 */
public class Result {
    private int months;
    private float sufficit;

    public Result(int months, float sufficit) {
        this.months = months;
        this.sufficit = sufficit;
    }

    public String toString() {
        return String.format("number of months %d, sufficit: %f", months, sufficit);
    }
}
