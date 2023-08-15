package lesson10.practice;

//изменить порядок слов в данной строке на обратный
//        На входе: Hello I like Java
//        На выходе: olleH I ekil avaJ
//        Наш метод на вход должен принимать строку и возвращать тоже строку

public class Task3 {

    public static void main(String[] args) {


        String phrase = "Hello I like Java";

        System.out.println(getPhraseWithReverseWord(phrase));

    }

    public static String getPhraseWithReverseWord(String str){
        String[] arrayString = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : arrayString){
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            result.append(sb).append(" ");
        }
        result.setLength(result.length()-1);
        return result.toString();
    }
}
