public class Silnia {
    public static int Rek(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Rek(n - 1);
        }
    }

    public static int Iter(int n) {
        int wyn = 1;
        for (int i = 1; i <= n; i++) {
            wyn *= i;
        }
        return wyn;
    }
}
