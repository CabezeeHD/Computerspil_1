public class City implements Comparable<City>{
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

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getInitialValue() {
        return initialValue;
    }
@Override
    public String toString() {
        return name + " (" + value + ")";
    }

    public int compareTo(City other){
            return name.compareTo(other.name);
    }
@Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {return true;}
        if (otherObject == null) {return false;}
        if (getClass() != otherObject.getClass()) {return false;}
        City other =(City) otherObject;
        return name.equals(other.name);
    }
@Override
    public int hashCode() {
        return 11 * name.hashCode();
    }
}
