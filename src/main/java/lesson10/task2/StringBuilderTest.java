package lesson10.task2;

public class StringBuilderTest {

    public static void main(String[] args) {


//        StringBuilder builder = new StringBuilder();
//        StringBuilder builder = new StringBuilder(50);
        StringBuilder builder = new StringBuilder("Apple");
//        builder.trimToSize();

        System.out.println("Size of storage - " + builder.capacity());
        System.out.println("Size o string - " + builder.length());

        System.out.println("String - " + builder);
        builder.append("Banana").append("Cherry").append("Peach");

        System.out.println("Size of storage - " + builder.capacity());
        System.out.println("Size o string - " + builder.length());

        System.out.println("String - " + builder);

        builder.appendCodePoint(21);
        System.out.println("String - " + builder);

        System.out.println(builder.charAt(5));

        builder.delete(11, 17);

        System.out.println(builder);

        builder.deleteCharAt(builder.length() - 1);

        System.out.println(builder);

        System.out.println(builder.indexOf("e"));

        builder.insert(5, "Lemon");

        System.out.println(builder);

        builder.replace(5, 10, "Kiwi");

        System.out.println(builder);

        String substr = builder.substring(9, 15);

        System.out.println(substr);

        String result = builder.toString();

        System.out.println(result);

        builder.reverse();

        System.out.println(builder);

    }
}
