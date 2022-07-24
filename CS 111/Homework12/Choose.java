package Homework12;

public class Choose {
    int n;
    int k;
    public static void main(String[] args) {
		for (int n = 0; n < 10; n++) {
			for (int k = 0; k <= n; k++) 
				System.out.printf("%d\t", choose(n, k));
			System.out.println();
		}
	}

    public static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    public static long choose(int n, int k) {
        return fact(n) / (fact(k) * fact(n - k));
    }
}
