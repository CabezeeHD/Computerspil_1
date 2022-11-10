import java.util.Objects;

/**
 * This class models a Road
 * A Road is a one directional
 * @author Mads Munk
 * @author Victor Isachsen
 */

public class Road implements Comparable<Road>{
    private City from;
    private City to;
    private int length;

    /**
     * Konstruktør til klassen der initialisere feltvariablerne.
     * @param from      Fra hvilken by.
     * @param to        Til hvilken by.
     * @param length    længden mellem byerne.
     */
    public Road(City from, City to, int length) {
        this.from = from;
        this.to = to;
        this.length = length;
    }

    /**
     * Metode der henter et City objekt og kalder den fra denne by.
     * @return  Returnere byens navn og værdi.
     */
    public City getFrom() {
        return from;
    }

    /**
     * Metode der henter et City objekt og kalder det til denne by.
     * @return  Returnere byens navn og værdi.
     */
    public City getTo() {
        return to;
    }

    /**
     * Metode der henter længden i feltvariablen.
     * @return  Returnere længden fra feltvariablen.
     */
    public int getLength() {
        return length;
    }

    /**
     * Laver en tekststreng ud fra tekster og andre primitive typer.
     * @return  Returnere en tekststreng på den korrekte form.
     */
    @Override
    public String toString() {
        return from + " -> " + to + " : " + length;
    }

    /**
     * Metode der sammenligner to Road objecter og deres forskellige feltvariabler.
     * @param other the object to be compared.
     * @return  Returnere det Road objekt der er sorteret efter start by, destinations by og længden imellem.
     */
    public int compareTo(Road other) {
        if (!from.equals(other.from)) {
            return from.compareTo(other.from);
        } else if (!to.equals(other.to)) {
            return to.compareTo(other.to);
        }
        return length - other.length;
    }

    /**
     * Metoder der sammenligner to objekter kun på deres start by.
     * @param otherObject objekt der sammenlignes med
     * @return  Returnere ligheden mellem start by.
     */
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {return true;}
        if (otherObject == null) {return false;}
        if (getClass() != otherObject.getClass()) {return false;}
        Road other =(Road) otherObject;
        return from.equals(other.from) && to.equals(other.to) && length == other.getLength();
    }

    /**
     * Metode til at hashe med så man undgår for mange kollisioner.
     * @return  Returnere haskoden.
     */
    @Override
    public int hashCode() {
        //Implementeres metoden på måden vist i slides med "13 * new Integer(age).hashcode" fås fejlmeddelelse.
        Integer i = Integer.valueOf(length);
        return 13 * from.hashCode() + 17 * to.hashCode() + 11 * i.hashCode();
    }
}
