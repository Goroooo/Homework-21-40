public class Homework {
    public static void main(String[] args) {

        //21
        int a = 1, b = 8, c = 14;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else
            System.out.println(c);


        //22

        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else
            System.out.println(c);

        //23
        boolean u = a == 1 || b == 1 || c == 1;
        System.out.println(u);

        //24
        a = 2;
        c = 2;
        boolean g = a == 2 && b == 2 || a == 2 && c == 2 || b == 2 && c == 2;
        System.out.println(g);

        //25
        int y;
        a = 8;
        b = 4;
        c = 6;
        if (a + b >= c && a + c >= b && b + c >= a) {
            y = 1;
            System.out.println(y);
        } else {
            y = 2;
            System.out.println(y);
        }

        //26
        a = 7;
        b = 5;
        c = 8;
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println("1asd");
        } else {
            System.out.println("2asd");
        }


        //27
        a = 4;
        b = 8;
        c = 16;
        boolean t = c - b == b - a;
        System.out.println(t);

        //28
        boolean o = c / b == 2 && b / a == 2;
        System.out.println(o);

        //29
        a = 10;
        b = 8;
        c = 6;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (c < a) {
            System.out.println(c + " " + a + " " + b);
        } else if (b > c) {
            System.out.println(a + " " + c + " " + b);
        } else {
            System.out.println(a + " " + b + " " + c);
        }

        //30
        a = 8;
        b = 10;
        c = 5;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (c > a) {
            System.out.println(c + " " + a + " " + b);
        } else if (b < c) {
            System.out.println(a + " " + c + " " + b);
        } else {
            System.out.println(a + " " + b + " " + c);
        }

        //31
        int x = 10, z = 20, q = 30, m = 40;
        if (x > z && x > q && x > m) {
            System.out.println(x);
        } else if (z > x && z > q && z > m) {
            System.out.println(z);
        } else if (q > x && q > z && q > m) {
            System.out.println(q);
        } else if (m > x && m > q && m > z) {
            System.out.println(m);
        }

        //32
        if (x < z && x < q && x < m) {
            System.out.println(x);
        } else if (z < x && z < q && z < m) {
            System.out.println(z);
        } else if (q < x && q < z && q < m) {
            System.out.println(q);
        } else if (m < x && m < q && m < z) {
            System.out.println(m);
        }

        //33
        x = 1;
        boolean n = x == 1 || z == 1 || q == 1 || m == 1;
        System.out.println(n);

        //34
        x = 10;
        z = 10;
        q = 5;
        m = 15;
        boolean v = x + z == q + m || x + q == z + m || x + m == z + q;
        System.out.println(v);

        //35
        x = 30;
        z = 10;
        q = 8;
        m = 12;
        boolean vv = x == z + q + m || z == x + q + m || q == x + z + m || m == x + z + q;
        System.out.println(vv);

        //36
        x = 7;
        z = 8;
        q = 10;
        m = 12;
        if (x % 2 == 1 && z % 2 == 1 ||
                x % 2 == 1 && q % 2 == 1 ||
                x % 2 == 1 && m % 2 == 1 ||
                z % 2 == 1 && m % 2 == 1 ||
                z % 2 == 1 && q % 2 == 1 ||
                q % 2 == 1 && m % 2 == 1) {
            System.out.println("Kent");
        } else {
            System.out.println("Zuyg");
        }

        //37
        x = 10;
        z = 12;
        q = 14;
        m = 16;
        boolean mm = m - q == q - z && q - z == z - x;
        System.out.println(mm);

        //38
        boolean nn = m / q == 2 && q / z == 2 && z / x == 2;
        System.out.println(nn);

        //39
        a = 3;
        b = 10;
        c = 6;
        int d = 8;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (a > d) {
            int temp = a;
            a = d;
            d = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (b > d) {
            int temp = b;
            b = d;
            d = temp;
        }
        if (c > d) {
            int temp = c;
            c = d;
            d = temp;
        }
        System.out.println(a + " " + b + " " + c + " " +d);

        //40
        a = 3;
        b = 10;
        c = 6;
        int e = 8;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (a < e) {
            int temp = a;
            a = d;
            e = temp;
        }
        if (b < c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (b < e) {
            int temp = b;
            b = e;
            e = temp;
        }
        if (c < e) {
            int temp = c;
            c = e;
            e = temp;
        }
        System.out.println(a + " " + b + " " + c + " " +e);

    }
}
