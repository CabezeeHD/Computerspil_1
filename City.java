public class City implements Comparable<City>{
    private String name;
    private int value;
    private int initialValue;

    public City(String name, int value) {
        this.name = name;
        this.value = value;
        this.initialValue = value;
    }

    private void changeValue(int amount) {
        value += amount;
    }

    private void reset() {
        value = initialValue;
    }

    public String toString() {
        return name + " (" + value + ") ";
    }

    public int compareTo(City other){
        if(name != other.name){
            return name.compareTo(other.name);
        }
        return value - other.value;
    }
}
