package lab1;

public class Multiples {
    public static void main(String[] args) {
        int n = 1000;
        int a = 3;
        int b = 5;
        System.out.println("Multiples of 3: " + multiples(n, a, b));
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    public static int multiples(int n, int a, int b) {
        int multiplesOfThreeOrFive = 0;

        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                multiplesOfThreeOrFive++;
            }
        }
        return multiplesOfThreeOrFive;
    }
}

