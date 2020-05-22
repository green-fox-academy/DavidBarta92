package VariableMutation;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a = a + 10;

        System.out.println(a);

        int b = 100;
        b = b - 7;

        System.out.println(b);

        int c = 44;
        c = c * 2;

        System.out.println(c);

        int d = 125;
        d = d / 5;

        System.out.println(d);

        int e = 8;
        e = e ^ 3;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean ff = f1 > f2;
        System.out.println(ff);

        int g1 = 350;
        int g2 = 200;
        boolean gg = (g2 * 2) > g1;
        System.out.println(gg);

        int h = 135798745;
        int div = h % 11;
        boolean hh = div == 0;
        System.out.println(hh);

        int i1 = 10;
        int i2 = 3;
        boolean ii = i1 > (i2 ^ 2);
        boolean ii2 = i1< (i2 ^ 3);
        System.out.println(ii);
        System.out.println(ii2);

        int j = 1521;
        boolean jj = (j % 3) == 0 || (j % 5) == 0;
        System.out.println(jj);
    }
}
