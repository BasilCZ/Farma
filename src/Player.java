public class Player {
    private String name;
    private int money;

    public Player(String name) {
        this.name = name;
        this.money = 0;
    }

    public void addMoney(int howMuch){
        money+=howMuch;
    }

    public void takeMoney(int howMuch){
        money-=howMuch;
    }
}
