/*
Name: Ahmed Jobaer
Matric No: 1918243
Section: 05
 */
package exam;


import java.util.Scanner;


public class Sukuk {

    static double Sukuk_Calculator(double sv, double op, double cs, double tp, double tc) {
        double a1 = (sv * tp) - tc;
        double a2 = (sv * op) + cs;
        return a1 - a2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, m, j, k, p = 8, q = 16, o, l, r, s, tt = 1, total = 5, ad = 0, sub = 5;
        char ch;
        String a, b, c;
        System.out.println("Which Sukuk calculator do you wanna use ? ");
        System.out.println("Press 1 for Single Sukuk Calculator ");
        System.out.println("Press 2 for Multiple Sukuk Calculator ");
        n = sc.nextInt();
        if (n == 1) {
            m = 1;
        } else {
            System.out.print("Enter the number of Sukuk sales transections : ");
            m = sc.nextInt();
        }
        double ans = 0.00;
        for (i = 1; i <= m; i++) {
            double sv, op, cs, tp, tc;
            System.out.print("Enter Sukuk volume (in units) : ");
            sv = sc.nextInt();
            System.out.print("Enter the purchase price per Sukuk unit : ");
            op = sc.nextInt();
            System.out.print("Enter the Sukuk purchase commission paid : ");
            cs = sc.nextInt();
            System.out.print("Enter the sell price of per Sukuk unit : ");
            tp = sc.nextInt();
            System.out.print("Enter the Sukuk sale commission paid : ");
            tc = sc.nextInt();
            ans += Sukuk_Calculator(sv, op, cs, tp, tc);
        }
        System.out.print("The total profit is $");
        a = String.format("%.2f", ans);
        System.out.println(a);

    }
}
