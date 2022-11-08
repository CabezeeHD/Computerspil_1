/**
 * @author Mads Munk
 * @author Victor Isachsen
 */

public class Road implements Comparable<Road>{
    private City from;
    private City to;
    private int length;

    public Road(City from, City to, int length) {
        this.from = from;
        this.to = to;
        this.length = length;
    }

    public City getFrom() {
        return from;
    }

    public City getTo() {
        return to;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return from + " -> " + to + " : " + length;
    }

    public int compareTo(Road other) {
        if (!from.equals(other.from)) {
            return from.compareTo(other.from);
        } else if (!to.equals(other.to)) {
            return to.compareTo(other.to);
        }
        return length - other.length;
    }
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {return true;}
        if (otherObject == null) {return false;}
        if (getClass() != otherObject.getClass()) {return false;}
        Road other =(Road) otherObject;
        return from.equals(other.from);
    }

    @Override
    public int hashCode() {
        return 13 * from.hashCode();
    }
}
