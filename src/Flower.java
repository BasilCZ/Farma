public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
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
                '}';
    }

}
