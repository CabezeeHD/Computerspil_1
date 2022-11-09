import java.util.*;

/**
 * This class models a Country with a network of roads and cities.
 * @author Victor Isachsen
 * @author Mads Munk
 */
public class Country {

    private String name;
    private Map<City, Set<Road>> network;

    public Country(String name) {
        this.name = name;
        this.network = new TreeMap<>();
    }
    public Set<City> getCities() {
        return network.keySet();
    }

    public City getCity(String name) {
        for (City c : network.keySet()) {
            if (c.getName().equals(name)) {
                return c;
            }
        }return null;
    }

    public String getName() {
        return name;
    }

    public Set<Road> getRoads(City c) {
        Set<Road> res = new HashSet<>();
        for (Road r : network.get(c)) {
            if (r.equals(c)) {
                res.add(r);
            }
        }return res;
    }

    public void reset() {
       for (City c: getCities()) {
           c.reset();
       }
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return 47 * name.hashCode();
    }
}

