/**
 * Created by Benjamin Ehlers on 12/19/2018.
 */
public class UpArrow {

    public UpArrow(){}

    public long calculate(long multiplicand, long multiplier, long numArrows) {
        if (numArrows < 1) return 1;
        if(numArrows == 1) {
            return (long) Math.pow(multiplicand, multiplier);
        }
        else {
            long result = multiplicand;
            for(long i = 0; i < multiplier; i++) {
                result = calculate(result, multiplicand, numArrows - 1);
            }
            return result;
        }
    }
}
