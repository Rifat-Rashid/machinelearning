import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by DevWork on 8/16/17.
 */
public class launcher {

    static int[] testX = {1, 2, 3};
    static int[] testY = {2, 4, 6};
    static int points = 3;
    static double m = 0.1; //start slope
    static double delta = .1;
    static double minChange = .05;

    public static void main(String[] args){
        while(getSlope() < minChange){
            iterate();
        }
    }

    public double getError(){
        int sum = 0;
        for(int i = 0; i < points; i++){
            sum += java.lang.Math.pow((testX[i] * m - testY[i]), 2);
        }
        return sum / m;
    }

    public static void iterate(){
        if(getSlope() < 0){
            m += delta;
        }
        else{
            m -= delta;
        }
    }

    public static double getSlope(){
        int sum = 0;
        for(int i = 0; i < points; i++){
            sum += ((testX[i] * m) - testX[i]) * testY[i];
        }
        return sum / m;
    }
}
