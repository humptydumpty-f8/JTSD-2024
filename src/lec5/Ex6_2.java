package lec5;

/**
 * Приклади методів, які отримують змінну кількість аргументів
 */
public class Ex6_2 {

    /**
     * Солідація значень
     *
     * @param param аргумент змінної довжини
     * @return суму значень типу double
     */
    static double sum(double ... param) {
        double sum = 0.;
        for (double d:param) {
            sum += d;
        }
        return sum;
    }

    /**
     * Визначення максимального значенням
     *
     * @param param аргумент змінної довжини
     * @return найбільше з значень
     */
    static double max(double ... param)
    {
        double max;
        if (param.length == 0) return 0;
        max = param[0];
        for (double v : param) {
            if (max < v) max = v;
        }
        return max;
    }

    /**
     * Визначення середнього значення
     *
     * @param param аргумент змінної довжини
     * @return середнє значення
     */
    static double average(double ... param) {
        double avg=0;
        int n = param.length;

        for (int i=0; i<n; i++)
            avg+=param[i];
        return avg/n;
    }
    public static void main(String[] args) {

        System.out.println("Сума : " + sum(1.,-2.0,3));
        System.out.println("Maксимальне : " + max(1.,-2.0,3));
        System.out.println("Середнє : " + average(1.,-2.0,3));
        System.out.println("Середнє : " + average(new double[]{1.,-2.0,3,4}));



    }
}
//todo add method to find the minimum value