import java.util.Scanner;
import java.lang.Math;
// Math.sqrt() This class is used to calculate square root
// Math.pow() This class is used for exponential to the power of 2
public class PythagoreanTheorem {
    public double calculateHypothenuse(int legA, int legB) {
        double C = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        return C;

    }

}