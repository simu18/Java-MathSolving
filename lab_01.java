public class lab_01 {
    public static void main (String[] args)
    {
        short r [] = new short[12];

        for (int i = 0; i<12; i++){
            r[i] = (short) (i* 2+2);
        }
        for (short num : r){
            System.out.println(num  + " ");
        }

    }
    
}
