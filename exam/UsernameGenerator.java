/*
Name: Ahmed Jobaer
Matric No: 1918243
Section: 05
 */
package exam;


import java.util.Random;
import java.util.Scanner;


public class UsernameGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, m, j, k, p = 8, q = 16, o, l, s, tt = 1, total = 5, ad = 0, sub = 5;
        char ch;
        String a, b, c;
        System.out.print("Enter your favourite food : ");
        a = sc.next();
        System.out.print("Enter your matric number : ");
        b = sc.next();
        k = 0;
        for (i = 0; i < b.length(); i++) {
            ch = b.charAt(i);
            o = ch - '0';
            k += o;
        }
        for (i = 0; i < 3; i++) {
            System.out.print(a.charAt(i));
        }
        System.out.print('#');
        for (i = b.length() - 3; i < b.length(); i++) {
            System.out.print(b.charAt(i));
        }
        p = 99;
        q = 1;
        Random randomNum = new Random();
        int ans = q + randomNum.nextInt(p);
        System.out.print(ans);
        System.out.println(k);

    }
}
