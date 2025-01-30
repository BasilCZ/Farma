import java.util.ArrayList;
import java.util.Random;

public class Farm {
    private Random rd = new Random();
    private ArrayList<Flower> farm = new ArrayList<>();
    private ArrayList<Animal> barn = new ArrayList<>();
    private double usedArea;
    private Player player;
    private int howManyBig;
    private int howManySmall;

    public Farm(Player p) {
        this.usedArea = 0;
        this.player = p;
        this.howManyBig = 0;
        this.howManySmall = 0;
    }

    public void plantFlower(Flower flower){
        if(flower.getNeededArea()+usedArea<=100 && farm.size()<5){
            farm.add(flower);
            System.out.println("You successfully planted the flower!");
        } else {
            System.out.println("There's not enough space for your flower");
        }
    }

    public void harvestFlower(Flower flower){
        for (int i = 0; i < farm.size(); i++) {
            if(flower.equals(farm.get(i))){
                int chance = rd.nextInt(100);
                if(chance<flower.chanceOfGrowth){
                    player.addMoney(50);
                }
                farm.remove(i);
            }
        }
    }

    public void waterFlower(Flower flower){
        for (int i = 0; i < farm.size(); i++) {
            if(flower.equals(farm.get(i))){
                farm.get(i).increaseChance(2);
            }
        }
    }

    public void destroyFlower(Flower flower){
        for (int i = 0; i < farm.size(); i++) {
            if(flower.equals(farm.get(i))){
                farm.remove(i);
            }
        }
    }

    public void addAnimal(Animal animal){
        if(animal.getSize() == Size.SMALL){
            if(howManySmall<10){
                barn.add(animal);
            }
        } else {
            if(howManyBig<10){
                barn.add(animal);
            }
        }
    }

    public void killAnimal(Animal animal){
        for (int i = 0; i < barn.size(); i++) {
            if(animal.equals(barn.get(i))){
                barn.remove(i);
            }
        }
    }

    public void petAnimal(){
        System.out.println("You petted the animal...");
    }

    public void sellAnimal(Animal animal){
        for (int i = 0; i < barn.size(); i++) {
            if(animal.equals(barn.get(i))){
                if(barn.get(i).getSize()==Size.SMALL){
                    player.addMoney(150);
                } else {
                    player.addMoney(300);
                }
                barn.remove(i);
            }
        }
    }
}
