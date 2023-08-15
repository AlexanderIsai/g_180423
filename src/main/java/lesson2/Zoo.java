package lesson2;

public class Zoo {

    public static void main(String[] args) {

        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();
        System.out.println(tiger1.weight);
        tiger1.weight = 150;
        tiger1.sleep();
        Tiger.legsCount = 120;
        System.out.println(tiger1.weight);
        System.out.println(tiger1.legsCount);

        System.out.println(Tiger.legsCount);
        System.out.println(tiger1);

        int i = 7;
        System.out.println(i);
    }
}
