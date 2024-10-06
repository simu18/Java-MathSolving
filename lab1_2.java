import java.util.Arrays;
import java.util.Random;

public class lab1_2{

    public static void Ar(double[] x){
        Random rand = new Random();
        double min = -0.6;
        double max = 2.0;


        for (int i = 0; i< x.length; i ++){
            x[i] = min + (min-max)* rand.nextDouble();
        }
    }
    public static void printAr(double[] x){
        System.out.printf(Arrays.toString(x));
    }

    public static void main(String[] args) {
        double[] x = new double[16];
        

        Ar(x);
        printAr(x);
    }


    }

