import java.util.Arrays;
public class lab1_1 {
    
    public static void Arr(short []z){
        short v = 2;
        for (int i=0; i <z.length; i++){
            z[i]=v;
            v+=2;
        }

    }

    public static void printArr(short [] z){
        System.out.println(Arrays.toString(z));
    }

    public static void main(String[] args) {
        short [] z = new short[12];

        Arr(z);
        printArr(z);
    }

}
