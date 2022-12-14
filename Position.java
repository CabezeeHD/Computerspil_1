import java.util.Objects;

/**
 * @author Victor Isachsen
 * @author Mads Munk
 */
public class Position {
    private City from;
    private City to;
    private int distance;
    private int total;

    /**
     * Konstruktør der initialisere feltvariablerne.
     *
     * @param from     Start position i byen.
     * @param to       Slut position i byen.
     * @param distance Den afstand der er tilbage.
     */
    public Position(City from, City to, int distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.total = distance; //Distancen mellem to byer.
    }

    /**
     * Metode der returnere et City objekt som er start byen for vejen.
     *
     * @return Returnere et City objekt.
     */
    public City getFrom() {
        return from;
    }

    /**
     * Metode der returnere et City objekt som er slut byen for vejen.
     *
     * @return Returnere et City objekt.
     */
    public City getTo() {
        return to;
    }

    /**
     * Metode der returnere den resterende afstand.
     *
     * @return Returnere den afstand der er tilbage.
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Metode der returnere distancen mellem to byer.
     *
     * @return Returnere længden på vejen mellem to byer.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Metode til at bevæge spilleren med.
     *
     * @return Returnere om spilleren har bevæget sig.
     */
    public boolean move() {
        if (distance > 0) {
            distance--;
            return true;
        }
        return false;
    }

    public void turnAround() {
        City temp = from;
        from = to;
        to = temp;
        distance = total - distance;
    }

    /**
     * Metode der checker om spilleren har nået byen.
     *
     * @return Returnere true hvis distancen er lig 0.
     */
    public boolean hasArrived() {
        return distance == 0;
    }

    /**
     * Laver en tekststreng ud fra tekster og andre primitive typer.
     *
     * @return Returnere en tekststreng på den korrekte form.
     */
    @Override
    public String toString() {
        return from + " -> " + to + " : " + distance + "/" + total;
    }

    /**
     * Metode til at sammenligne to Position objekter med.
     * @param o Objekt at sammenligne med.
     * @return  Returnere sammenlignede objekter.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return distance == position.distance && total == position.total && from.equals(position.from) && to.equals(position.to);
    }

    /**
     * Metode til at hashe med så man undgår for mange kollisioner.
     * @return Returnere haskoden.
     */
    @Override
    public int hashCode() {
        return 31 * from.hashCode() + 7 * to.hashCode() + 13 * Integer.valueOf(total).hashCode() + 23 * Integer.valueOf(distance).hashCode();
    }
}
