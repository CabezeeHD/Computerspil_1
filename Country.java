import java.util.*;

/**
 * This class models a Country with a network of roads and cities.
 * @author Victor Isachsen
 * @author Mads Munk
 * @Version 1
 */
public class Country {

    private String name;
    private Map<City, Set<Road>> network;

    private Random random;

    /**
     * Constructor.
     * Initializes two field variables and takes one parameter.
     * @param name  The name of the country.
     */
    public Country(String name) {
        this.name = name;
        this.network = new TreeMap<>();
    }

    /**
     * Getter method.
     * Method that returns all the cities in the Country.
     * @return
     */
    public Set<City> getCities() {
        return network.keySet();
    }

    /**
     * Getter method.
     * Method that returns a city with a given name.
     * @param name  Name of the city you want to find.
     * @return      Returns the city if such exists.
     */
    public City getCity(String name) {
        for (City c : network.keySet()) {
            if (c.getName().equals(name)) {
                return c;
            }
        }return null;
    }

    /**
     * Getter method.
     * A method to get the name of the country.
     * @return  Returns the name of the country.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method.
     * This method gets all the roads in a specified city
     * @param c The city we want to find the roads in
     * @return  Returns a Set containing all the roads of a City.
     */
    public Set<Road> getRoads(City c) {
        Set<Road> res = new HashSet<>();
        for (Road r : network.get(c)) {
            if (r.equals(c)) {
                res.add(r);
            }
        }return res;
    }

    /**
     * A method that reset the cities.
     */
    public void reset() {
       for (City c: getCities()) {
           c.reset();
       }
    }

    public String toString() {
        return name;
    }

    /**
     * Equals method to check if two objects are the same. This equals method checks for the objects name.
     * @param o The object to be compared.
     * @return  Returns true if the names are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name);
    }

    /**
     * Hashing method. Hashes the name using a prime number to avoid as many collisions as possible.
     * @return  Returns the hashcode number.
     */
    @Override
    public int hashCode() {
        return 47 * name.hashCode();
    }
}

