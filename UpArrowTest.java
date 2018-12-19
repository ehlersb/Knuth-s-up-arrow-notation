/**
 * Created by Benjamin Ehlers on 12/19/2018.
 */
public class UpArrowTest {

    public UpArrowTest() {}
    public static void main(String[] args) {
        UpArrow u = new UpArrow();
        long multiplicand = 3;
        long multiplier = 3;
        long numArrows = 2;
        String arrows = "";
    for (int i = 0; i < numArrows; i++) {
        arrows+= "\u2191";
    }
        System.out.print(multiplicand + arrows + multiplier + " = ");
        System.out.println(u.calculate(multiplicand, multiplier, numArrows));
    }
}
