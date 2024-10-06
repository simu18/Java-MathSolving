import java.util.Arrays;
public class lab1_3 {
    public static double calculate (int z, double x){
        if (z==22){
            return Math.pow(Math.atan(Math.pow((x-2)/8,2))+ 1,3);
        }
        else if(z == 2 || z == 6 || z == 8 || z == 14 || z == 18 || z == 20){
            return Math.pow(2/Math.log(Math.abs(x)/2), 2);
        }
        else{
            return Math.atan(1/(Math.exp(1*Math.sqrt(Math.abs(Math.sin(Math.pow((x+2.0/3.0)/x, x)))))));
        
        }
    }

    public static void printCal(double[][] mat){
        for(double [] row : mat){
            for(double result: row){
                System.out.printf("%.4f\t", result);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 12;
        int cols= 16;

        double [][] z = new double[row][cols];
        
        for( int i =0; i<row; i++){
            for (int j = 0; j<cols; j++){
                double x=j;
                z[i][j] = calculate(i, x);
            }
        }

        printCal(z);
    }
}
