/*
Name: Ahmed Jobaer
Matric No: 1918243
Section: 05
 */
package exam;

import java.util.Scanner;


public class Covid19Luggage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, m, j, k, p = 8, q = 16, o, l, r, s, tt = 1, total = 5, ad = 0, sub = 5;
        
        System.out.print("Enter the number of suitecases:");
        n = sc.nextInt();
        int ar[] = new int[n];
        int br[] = new int[n];
        for (i = 1; i <= n; i++) {
            System.out.print("Enter the dimensions of the suitcase " + i + "(length and width height):");
            p = sc.nextInt();
            q = sc.nextInt();
            r = sc.nextInt();
            o = p * q * r;
            ar[i - 1] = o;
        }
        for (j = 1;; j++) {
            k = 0;
            for (i = 0; i < n; i++) {
                if (br[i] == 0) {
                    k++;
                }
            }
            if (k == 0) {
                break;
            }
            System.out.print("Carton " + j + " contains objects with volume : ");
            k = 0;
            for (i = 0; i < n; i++) {
                if (br[i] == 0 && k + ar[i] <= 4000) {
                    k += ar[i];
                    br[i] = 1;
                    System.out.print(ar[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.print("The total charges are : ");
        j--;
        if (j == 1) {
            System.out.println(0.0);
        } else {
            double ans = 0.0, sum = 500.00, pr = 25;
            for (i = 1; i < j; i++) {
                double per = Double.valueOf(pr);
                sum += (per * sum) / 100.00;
                ans += sum;
                pr += 25;
            }
            System.out.println(sum);
        }

    }
}
