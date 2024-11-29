
import java.util.Scanner;

class Main {

    public static void ArithmeticSequence(int a1, int d, int n) {
        System.out.print(a1 + ", ");
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                a1 += d;
                String num = Integer.toString(a1) + ", ";
                System.out.print(num);
            } else {
                a1 += d;
                System.out.print(a1);
            }
        }
    }

    public static void GeometricSequence(int a1, int r, int n) {
        System.out.print(a1 + ", ");
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                a1 *= r;
                String num = Integer.toString(a1) + ", ";
                System.out.print(num);
            } else {
                a1 *= r;
                System.out.print(a1);
            }
        }
    }

    private String CombinedSequenceGenerator() {
        Scanner scan = new Scanner(System.in);
        boolean isArithmetic = false;
        String input = "";
        OUTER:
        while (!input.equals("A") || !input.equals("G")) {
            System.out.println("Enter 'A' for Arithmetic or 'G' for Geometric: ");
            input = scan.nextLine();
            switch (input) {
                case "A" -> {
                    isArithmetic = true;
                    break OUTER;
                }
                case "G" -> {
                    isArithmetic = false;
                    break OUTER;
                }
                default ->
                    System.out.println("Invalid input");
            }
        }

        if (isArithmetic == true) {
            //ArithmeticSequence
            System.out.println("Enter first term: ");
            int a1 = scan.nextInt();
            System.out.println("Enter common difference: ");
            int d = scan.nextInt();
            System.out.println("Enter number of terms: ");
            int n = scan.nextInt();
            System.out.println("Arithmetic Sequence: ");
            ArithmeticSequence(a1, d, n);
        } else {
            //GeometricSequence
            System.out.println("Enter first term: ");
            int a1 = scan.nextInt();
            System.out.println("Enter common ratio: ");
            int r = scan.nextInt();
            System.out.println("Enter number of terms: ");
            int n = scan.nextInt();
            System.out.println("Geometric Sequence: ");
            GeometricSequence(a1, r, n);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println("Assignment: Creating Arithmetic and Geometric Sequence Generators");
        System.out.println("------------------------------------------------------------------");
        Main app = new Main();
        Boolean again = true;
        while (again) {
            app.CombinedSequenceGenerator();
            System.out.println("\nDo you want to generate another sequence? (Y/N)");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input.equals("Y")) {
                again = true;
            } else {
                again = false;
            }
        }
        app.CombinedSequenceGenerator();
    }
}
