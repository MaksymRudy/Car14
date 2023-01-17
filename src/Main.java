public class Main {
    public static void main(String[] args) {

        Car14 T1 = new Car14();
        Car14 T2 = new Car14();

        System.out.println(T1.getAge());
        System.out.println(T1.calculateIndex());
        System.out.println(T2.power);
        System.out.println(T2.upgradePower(200));
        System.out.println(T2.calculateIndex());
    }
}