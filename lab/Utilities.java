
package lab;


public class Utilities {
    static double findAvg(double[] theValues){
        double mSum = 0;
        for (int i = 0; i < theValues.length; i++) {
            mSum += theValues[i];
            
        }
        return(mSum / theValues.length);
        
    }
    
}
