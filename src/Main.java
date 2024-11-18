import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialisierung des Scanners
        Scanner scanner = new Scanner(System.in);

        // Eingabeaufforderung
        System.out.println("Bitte gebe eine Zahl ein, um die Fibonacci-Folge zu berechnen:");
        System.out.print("> ");
        // Wir benutzen double, da ab einer bestimmten Stelle die Zahlen zu groß für int sind.
        int input = scanner.nextInt();

        /*
         * Berechnung der nächsten Zahl in der Fibonacci-Folge.
         * Die nächste Zahl ist die Summe der beiden vorherigen Zahlen.
         * a = 1, b = 1 → next = 1 + 1 = 2
         * a = 1, b = 2 → next = 1 + 2 = 3
         * ...
         */
        double number_a = 1, number_b = 1;
        for (int i = 0; i < input; i++) {
            if (i == input - 1) {
                System.out.println("Ihre Zahl in der Fibonacci-Folge ist: " + number_a);
                break;
            }

            System.out.println(number_a);
            double next = number_a + number_b;
            number_a = number_b;
            number_b = next;
        }

    }
}