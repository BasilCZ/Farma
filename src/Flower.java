public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    protected Type type;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth, Type type) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.type = type;
        if(chanceOfGrowth>100){
            this.chanceOfGrowth = 100;
        } else if (chanceOfGrowth<0){
            this.chanceOfGrowth = 0;
        } else {
            this.chanceOfGrowth = chanceOfGrowth;
        }
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                ", type=" + type +
                '}';
    }

    public double getNeededArea() {
        return neededArea;
    }

    public void increaseChance(int howMuch){
        if(chanceOfGrowth+howMuch>100){
            chanceOfGrowth = 100;
        } else {
            chanceOfGrowth += howMuch;
        }
    }

    public double getPrice() {
        return price;
    }
}
