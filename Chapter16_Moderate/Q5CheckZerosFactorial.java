package Chapter16Moderate;

public class Q5CheckZerosFactorial {

    private static int getFiveNumber(int num){
        int count = 0;
        while (num%5 ==0){
            count++;
            num = num/5;
        }
        return count;
    }

    public static int getZeroFactorial(int num){
        if(num == 0 || num == 1){
            return num;
        }

        int zeroCount = 0;
        for(int i=2;i<=num;i++){
            zeroCount = zeroCount + getFiveNumber(i);
        }
        return zeroCount;
    }

    private static int zerosInFactorialOptimized(int num){
        if(num < 0){
            return -1;
        }
        int count = 0;
        for(int i=5;num/i>0;i=i*5){
            count = count + num/i;
        }
        return count;
    }

    public static void main(String[] args){
        int count = getZeroFactorial(25);
        System.out.println(count);
    }

}
