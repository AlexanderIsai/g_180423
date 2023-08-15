//напишите метод, который принимает две строки в аргументах, соединяет их и
// определяет реверсивный порядок, выведите результат на консоль.
//public String concatReversStr(String str1, String str2)

package lesson10.practice;

public class Task1 {

    public static void main(String[] args) {

    String word1 = "TheFirstWord";
    String word2 = "ThesecondWord";
        System.out.println(concatReversStr(word1, word2));


    }

    public static String concatReversStr(String str1, String str2) {

        StringBuilder builder = new StringBuilder();
        return builder.append(str1).append(str2).reverse().toString();
    }
}
