package lec3;

/**
 * Простий приклад форматованого виведення цілих чисел
 */

public class Ex2_1 {
    public static void main(String[] args) {

        int x = 333;
        int y = 22;
        int z = -1;
        System.out.printf("x= %+3d %n y=%+3d \n z=%+03d", x, y, z);
    }
}
