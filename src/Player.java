import java.util.ArrayList;

public class Player {
    private String name;
    private int money;
    private ArrayList<Flower> flowerInventory = new ArrayList<>();
    private ArrayList<Animal> animalInventory = new ArrayList<>();

    public Player(String name) {
        this.name = name;
        this.money = 100;
    }

    public void addMoney(int howMuch){
        money+=howMuch;
    }

    public void takeMoney(int howMuch){
        money-=howMuch;
    }

    public void addFlowerToInventory(Flower flower){
        flowerInventory.add(flower);
    }

    public void addAnimalToInventory(Animal animal){
        animalInventory.add(animal);
    }

    public int getMoney() {
        return money;
    }
}
