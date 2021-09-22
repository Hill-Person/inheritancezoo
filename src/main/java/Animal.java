public abstract class Animal {

    public Animal(boolean isAlive, String name) {
        this.isAlive = isAlive;
        this.name = name;
    }

    protected boolean isAlive;
    protected String name;

    public boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return name;
    }

    public abstract void move();

    public abstract void animalSound();

    public abstract void eat();

}
