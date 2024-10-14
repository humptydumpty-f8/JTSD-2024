package lec5;

/**
 * Використання анонімного масиву
 */
public class Ex5_1 {

    static double sum(double[] array) {
        double sum = 0.;
        for (double d:array) {
            sum += d;
        }
        return sum;
    }

    public static void main(String[] args) {
        //Виклик функції з аргументом у вигляді анонімного масиву
        System.out.println(sum(new double[]{1,2,3,4,5}));
    }
}
