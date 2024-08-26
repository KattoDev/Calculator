package Ops;

/**
 * @author Kris
 */
public class Operations {

    public static int Addition(int num1, int num2){
        int sum;

        sum = num1 + num2;

        return sum;
    }
    
    public static int Substract(int num1, int num2){
        int substract;

        substract = num1 - num2;

        return substract;
    }

    public static int Multiply(int num1, int num2){
        int product;

        product = num1 * num2;

        return product;
    }

    public static Double Divide(int num1, int num2){
        return Double.valueOf(Integer.toString(num1))/Double.valueOf(Integer.toString(num2));
    }

    public static int Pow(int num){
        return (int) Math.pow(num, 2);
    }

    public static Double InvertOf(int num){
        return (double) (1/num);
    }

    public static Double SquareRoot(int num){
        return Math.sqrt(num);
    }

    public static Double Percent(int num){
        return (double) num/100;
    }
}
