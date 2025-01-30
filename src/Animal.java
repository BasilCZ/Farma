public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;

    public Animal(String type, String name, Size size, String specialCare) {
        this.type = type;
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }

    public Size getSize() {
        return size;
    }
}
