
package lab;


public class Q2 {
    public static void main(String[] args) {
        double[] weight = {50,45,65,85,47};
        double[] height = {1.5,1,1.7,1.8,1.2};
        double[] bmi = {0,0,0,0,0};
        
        for (int i = 0; i <5; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
        }
        int counter = 1;
        for (double x : bmi) {
            System.out.println("Bmi for person[" + counter + "] = " + x);
            counter++;
        }
        
    }
}
