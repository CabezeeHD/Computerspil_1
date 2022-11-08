public class City {
    private String name;
    private int value;
    private int initialValue;

    public City(String name, int value) {
        this.name = name;
        this.value = value;
        this.initialValue = value;
    }

    public void changeValue(int amount) {
        value += amount;
    }

    public void reset() {
        value = initialValue;
    }

    public String toString() {
        return name + " (" + value + ") ";
    }
}
