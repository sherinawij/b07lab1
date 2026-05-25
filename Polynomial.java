public class Polynomial {
    private double[] coef;

    public Polynomial() {
        coef = new double[1];
        coef[0] = 0;
    }

    public Polynomial(double[] arr) {
        coef = arr;
    }

    public Polynomial add(Polynomial p) {
        int n = coef.length;
        int m = p.coef.length;

        int len;
        if (n > m) {
            len = n;
        } else {
            len = m;
        }

        double[] ans = new double[len];

        for (int i=0;i<len;i++) {
            if (i < n) {
                ans[i] += coef[i];
            }

            if (i < m) {
                ans[i] += p.coef[i];
            }
        }

        return new Polynomial(ans);
    }

    public double evaluate(double x) {
        double ans = 0;

        for (int i=0; i<coef.length; i++) {
            ans += coef[i] * Math.pow(x, i);
        }

        return ans;
    }

    public boolean hasRoot(double x) {
        if (evaluate(x) == 0) {
            return true;
        } else {
            return false;
        }
    }
}