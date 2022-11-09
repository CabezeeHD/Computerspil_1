/**
 * This class models a City
 *
 * @author Victor Isachsen
 * @author Mads Munk
 */

public class City implements Comparable<City>{
    private String name;//Felt variabel til navn af byen.
    private int value;//Felt variabel til værdien af byen.
    private int initialValue;//Felt variabel til den startende værdi.

    /**
     * Konstruktør til klassen som initialisere feltvariablerne.
     * @param name  Navn på byen.
     * @param value Start værdi.
     */
    public City(String name, int value) {
        this.name = name;
        this.value = value;
        this.initialValue = value;
    }

    public Country getCountry() {
        return country;
    }

    /**
     * Mutatormetode til at ændre værdien af feltvariablen.
     * @param amount    Den nye værdi man vil lægge til.
     */
    public void changeValue(int amount) {
        value += amount;
    }

    /**
     * Nulstiller værdien til start værdien.
     */
    public void reset() {
        value = initialValue;
    }

    /**
     * Henter navnet fra feltvariablen.
     * @return  Returnere navnet på byen.
     */
    public String getName() {
        return name;
    }

    /**
     * Henter værdien i feltvariablen.
     * @return  Returnere værdien.
     */
    public int getValue() {
        return value;
    }

    /**
     * Henter startværdien i feltvariablen.
     * @return  Returnere start værdien.
     */
    public int getInitialValue() {
        return initialValue;
    }

    /**
     * Laver en tekststreng ud fra tekster og andre primitive typer.
     * @return  Returnere en tekststreng på den korrekte form.
     */
    @Override
    public String toString() {
        return name + " (" + value + ")";
    }

    /**
     * Sammenlignings metode mellem to objekters navne.
     * @param other the object to be compared.
     * @return  Returnere i alfabetisk sorteret rækkefølge.
     */
    public int compareTo(City other){
            return name.compareTo(other.name);
    }

    /**
     * Metode der sammenligner om to objekter er ens.
     * @param otherObject   Objekt at semmenligne med.
     * @return  Returnere objekter sammenlginet efter navn.
     */
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {return true;}
        if (otherObject == null) {return false;}
        if (getClass() != otherObject.getClass()) {return false;}
        City other =(City) otherObject;
        return name.equals(other.name);
    }

    /**
     * En metode til at hashe så man undgår for mange kollisioner.
     * @return  Returnere hashkoden.
     */
    @Override
    public int hashCode() {
        return 11 * name.hashCode();
    }
}
