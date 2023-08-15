package lesson10.practice;

public class Task4 {

    public static void main(String[] args) {

        String phrase = "Ich lerne Deutsch jeden Tag";
        getPhraseWithReverseWord(phrase);
    }

    public static void getPhraseWithReverseWord(String str) {
        String[] arrayString = str.split(" ");
        int backspace = arrayString.length - 1;
        for (String word : arrayString) {
            char[] arrayChar = word.toCharArray();
            int size = arrayChar.length;
            for (int i = 0; i < size / 2; i++) {
                char temp = arrayChar[i];
                arrayChar[i] = arrayChar[size - i - 1];
                arrayChar[size - i - 1] = temp;
            }
            String stringOfChar = new String(arrayChar);
            if (backspace > 0) {
                stringOfChar = stringOfChar + " ";
            }
            System.out.print(stringOfChar);
            backspace--;
        }
    }
}
