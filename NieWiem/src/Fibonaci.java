public class Fibonaci {
    public static int Rek(int n) {
        if (n <= 1) {
            return n;
        }
        return Rek(n - 1) + Rek(n - 2);
    }

    public static int Iter(int n) {
        if (n <= 1) {
            return n;
        }
        int wyn = 1;
        int prevWyn = 1;

        for (int i = 2; i < n; i++) {
            int temp = wyn;
            wyn += prevWyn;
            prevWyn = temp;
        }

        return wyn;
    }
}
