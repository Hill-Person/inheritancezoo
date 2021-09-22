public class Bat extends Mammal implements Flying {
    private int hearing;
    public Bat(boolean isAlive, String name, String furType, int hearing) {
        super(isAlive, name, furType);
        this.hearing = hearing;
    }

    @Override
    public void move() {
        System.out.println(name + "shuffles");
    }

    @Override
    public void animalSound() {
        System.out.println(name + "echo locates with its hearing of " + hearing);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats some flies");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies, but by using sonar.");
    }

    @Override
    public void land() {
        System.out.println(name + " lands upside down.");
    }

    @Override
    public void giveBirth() {

    }
}
