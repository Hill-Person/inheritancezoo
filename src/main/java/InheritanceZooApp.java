import java.util.ArrayList;

public class InheritanceZooApp {
    public static void main(String[] args) {
        ArrayList<Animal>  zoo = new ArrayList<>();
        zoo.add(new Chicken(true, "Clucky", 10, 2));
        zoo.add(new Owl(true, "Mr. Man", 1, 2));
        zoo.add(new Capybara(true, "Cappy","Fur", false));
        zoo.add(new Bat(true, "Bruce Wayne", "skin", 10));

        for (Animal currentAnimal : zoo) {
            currentAnimal.animalSound();
            currentAnimal.move();
            currentAnimal.eat();

            if (currentAnimal instanceof Bird) {
                ((Bird)  currentAnimal).layEggs();
            }
            if (currentAnimal instanceof Flying) {
                ((Flying) currentAnimal).fly();
                ((Flying) currentAnimal).land();
            }

            if (currentAnimal instanceof Chicken) {
                // How to call a specific instance if you don't know what type, this is called typecasting.
                // Usually you will see an if statement followed by a cast.
                ((Chicken)currentAnimal).slaughter();
            }

            if (currentAnimal instanceof Capybara) {
                ((Capybara)currentAnimal).isClean();
            }
            if (currentAnimal instanceof Mammal){
                ((Mammal)currentAnimal).giveBirth();
            }
        }
    }
}
