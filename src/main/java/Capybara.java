public class Capybara extends Mammal implements Swimming {

    private boolean isClean;

    public Capybara(boolean isAlive, String name, String furType, boolean isClean) {
        super(isAlive, name, furType);
        this.isClean = isClean;
    }

    @Override
    public void giveBirth() {
        System.out.println(name + "babies are made");

    }

    @Override
    public void move() {
        System.out.println(name + " walks slowly");
    }

    @Override
    public void animalSound() {
        System.out.println(name + " reeeeeeeeeeeee");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats plants");
    }

    @Override
    public void swim() {
        System.out.println("swimmy");
    }

    public void isClean() {
        System.out.println(name + " cleans itself");
        isClean = true;
    }

}
