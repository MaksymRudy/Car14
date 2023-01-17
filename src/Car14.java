public class Car14 {
    int age = 0;
    int power = 200;
    int turbo = 30;

    int getAge() {
        return age;
    }

    int calculateIndex() {
        return power*10+turbo;
    }

    int upgradePower(int newPower) {
        power = power+newPower;
        return power;
    }

    }

