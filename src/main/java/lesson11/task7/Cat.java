package lesson11.task7;

public class Cat extends Animal{


    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    // We are feeting cat

    public boolean feedCat (int food) {
        return food >= 10;
    }
}
