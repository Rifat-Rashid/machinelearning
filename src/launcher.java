import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by DevWork on 8/16/17.
 */
public class launcher {

    int[] testX = {1, 2, 3};
    int[] testY = {2, 4, 6};
    int points = 3;
    double m = 0.1; //start slope

    public static void main(String[] args){
    }

    public double getError(){
        int sum = 0;
        for(int i = 0; i < points; i++){
            sum += java.lang.Math.pow((testX[i] * m), 2);
        }
        return sum / m;
    }




}
