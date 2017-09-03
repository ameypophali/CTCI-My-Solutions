package Chapter5BitManipulation;

/**
 * Created by ameyp on 7/13/2017.
 */
public class NextNumber {

    public static int getNextLargeNum(int num){
        int bitCount = Integer.bitCount(num);

        int nextnum = num+1;
        int nextbitCount = Integer.bitCount(nextnum);

        while(bitCount != nextbitCount){
            nextnum = nextnum+1;
            nextbitCount = Integer.bitCount(nextnum);
        }

        return nextnum;
    }

    public static int getNextOptimal(int num){
        int c = num;
        int c0 = 0;
        int c1 = 0;

        while((c&1) == 0 && (c!=0)){
            c0++;
            c>>=1;
        }

        while((c&1) == 1){
            c1++;
            c>>=1;
        }

        if(c0+c1 ==31 || c0+c1 ==0){
            return -1;
        }

        int p = c0+c1;

        System.out.print(Integer.toBinaryString(num) + " " + "\n");

        num = num | (1<<p);   //flip the rightmost 0 to 1

        int mask = ~((1<<p)-1);
        num = num & mask;   //flip all right to above 0 to 0
        num = num | (1<<(c1-1)) -1 ;

        return num;
    }

    public static void main(String[] args){
        int i = 7;

        int next = getNextLargeNum(i);
        int nextOptimal = getNextOptimal(i);

        System.out.println(next + " " + nextOptimal);

    }
}
