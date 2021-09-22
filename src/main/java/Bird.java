public abstract class Bird extends Animal {
    // Can't have methods (method body) in abstract classes, but you can have methods in the interface.
    protected int eggsPerWeek;

    public Bird(boolean isAlive, String name, int eggsPerWeek) {
        super(isAlive, name);
        this.eggsPerWeek = eggsPerWeek;
    }

    public int getEggsPerWeek() {
        return eggsPerWeek;
    }

    public abstract void layEggs();
}
