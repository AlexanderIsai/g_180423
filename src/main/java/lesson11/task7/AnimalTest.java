package lesson11.task7;

public class AnimalTest {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.voice();
        cat.voice();

        Animal someAnimal = new Animal() {
            @Override
            public void voice() {
                System.out.println("Kukareku");
            }
        };
        someAnimal.voice();

        new Dog().voice();
    }
}
