public class Shop {
    public void buyAnimal(Player player,String type, String name, double price, String specialCare){
        if(player.getMoney()>=price){
            player.takeMoney((int) price);
            //player.addAnimalToInventory();
        }
    }

    public void buyFlower(Player player){

    }
}
