import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Statistik {
    public static void main(String[] args)
    {
        int data[]= {1,2,3,4,5,6,7,8,9,10};

    }
    public static double mean(double[] m){
        double sum = 0;
        for (int i = 0; i <m.length;i++){
            sum += m[i];
        }    
        return sum/m.length;
    }
    public static double median(double[] m ){
        int middle = m.length/2;
        if (m.length%2 == 1){
            return m[middle];
        }
        else {
            return (m[middle-1]+m[middle])/2.0;
        }

    public static int modus(int a[]){
        int maxValue, maxCount;
        for (int i=0; i<a.length;i++){
            int count = 0;
            for (int j =0;j<a.length;j++){
                if (a[j] == a[i]){
                    ++count;
                }
                if (count > maxCount){
                    maxCount = count;
                    maxValue = a[i];
                }
            }
            return maxValue;    
        }

    }
    }    
    }
}
