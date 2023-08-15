package lesson11.task6;

public class Test {

    static Flyable somethungFlyable = new Flyable() {
        @Override
        public void fly() {
            System.out.println("Something is flying");
        }
    };

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.fly();
        somethungFlyable.fly();
    }
}
