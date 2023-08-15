package lesson10.practice;

//дан массив символов, обьедините его и замените символ '?' на правильный символ, выведите результат на консоль.
//        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

public class Task2 {

    public static void main(String[] args) {

        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        System.out.println(getCorrectValue(arr));

    }

    public static String getCorrectValue(char[] arr) {

        StringBuilder builder = new StringBuilder();
        builder.append(arr);
        int index = builder.indexOf("?");
        builder.replace(index, index+1, "e");
        return builder.toString();
    }
}
