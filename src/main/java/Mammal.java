public abstract class Mammal extends Animal {

    private String furType;

    public Mammal(boolean isAlive, String name, String furType) {
        super(isAlive, name);
        this.furType = furType;
    }

    public String getFurType() {
        return furType;
    }

    public abstract void giveBirth();

}
