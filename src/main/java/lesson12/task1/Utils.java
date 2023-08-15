package lesson12.task1;

public class Utils {

    public static int calculate(int a, int b, int c, int d){
        // посчитать и вернуть выражение (a + b - c) / d
        // вывести в консоль числитель
        // если знаменатель равен 0 - вывести предупреждение и заменить значение знаменателя на 1

        int numerator = a + b - c;
        System.out.println("Numerator = " + numerator);

        if (d == 0){
            System.out.println("D can not be 0");
            d = 1;
        }
        int result = numerator / d;

    return result;
    }

    public static int[] getArrayBySize(int size){
        int[] result = new int[size];

        for (int i = 0; i < size; i++){
            result[i] = i + 1;
        }
        return result;

    }
}
