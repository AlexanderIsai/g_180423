package lesson8.task2;

import java.util.Arrays;

public class ArrayOfObjects {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        Cat cat = new Cat(7, "black");
        cats[2] = cat;

        System.out.println(cats[2].getColor());

        Cat[] cats1 = {new Cat (2, "white"), new Cat(4, "grey"), cat};

        for (Cat currentCat: cats1) {
            System.out.println(currentCat.getAge() + " " + currentCat.getColor());
        }

        System.out.println(cats1[cats1.length - 1].getColor());

    }
}
