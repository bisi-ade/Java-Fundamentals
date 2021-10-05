import java.util.Scanner;
import java.lang.Math;
public class PythagoreanTheoremTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int legA, legB; 
        double hypothenus;
       
        // Get the length of legA
        System.out.println("Enter a value for legA: ");
        legA = input.nextInt();

        // Get the length of legB
        System.out.println("Enter a value for legB: ");
        legB = input.nextInt();

        PythagoreanTheorem ID = new PythagoreanTheorem();
        hypothenus = ID.calculateHypothenuse(legA, legB);
        System.out.println("The length of the hypothenus is: " + hypothenus);

    }

}