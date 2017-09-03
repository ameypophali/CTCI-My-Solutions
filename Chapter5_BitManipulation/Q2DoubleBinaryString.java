package Chapter5BitManipulation;

/**
 * Created by ameyp on 7/11/2017.
 */
public class Q2DoubleBinaryString {

    public static String doubleToBin(double d) throws Exception{
        if(d <= 0 || d >= 1){
            throw new Exception("Wrong Input");
        }

        StringBuilder result = new StringBuilder();


        result.append(".");
        while(d>0){
            if(result.length() >= 32){
                System.out.print(result);
                return "ERROR";
            }

            double r = d*2;

            if(r>=1){
                result.append(1);
                d = r-1;
            }
            else{
                result.append(0);
                d = r;
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        double i = 0.45;
        try {
            //String res = doubleToBin(i);
            System.out.print(Integer.BYTES*8);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
