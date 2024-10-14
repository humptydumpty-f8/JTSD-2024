package lec5;

/**
 * Застосування анонімних масивів замість списку аргументів змінної довжини
 */
public class Ex6_3 {

  /**
     * Визначення найменшого значенням
     *
     * @param param аргумент змінної довжини
     * @return найменше з значень
     */
    static double min(double ... param)
    {
        double min;
        if (param.length == 0) return 0;
        min = param[0];
        for (double v : param) {
            if (min > v) min = v;
        }
        return min;
    }


    public static void main(String[] args) {

        System.out.println("Мінімальне серед аргументів : " + min(1.,-2.0,3));
        System.out.println("Мінімальне в анонімному масиві : " + min(new  double[]{1.,-2.0,3}));

    }
}
