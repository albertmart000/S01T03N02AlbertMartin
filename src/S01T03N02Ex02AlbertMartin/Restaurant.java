package S01T03N02Ex02AlbertMartin;

import java.util.Comparator;
import java.util.Objects;

public class Restaurant implements Comparator<Restaurant> {

    private String name;
    private int punctuation;

    public Restaurant(String name, int punctuation) {
        this.name = name;
        this.punctuation = punctuation;
    }

    public String getName() {
        return name;
    }

    public int getPunctuation() {
        return punctuation;
    }

   @Override
    public int compare(Restaurant r1, Restaurant r2) {

        int resultName = r1.name.compareTo(r2.name);
        int resultPunctuation = String.valueOf(r2.getPunctuation()).compareTo(String.valueOf(r1.getPunctuation()));

        if (resultName != 0) {
            return resultName;
        }
        else {
            return resultPunctuation;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return punctuation == that.punctuation && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() { return name.hashCode();}

    @Override
    public String toString() {
        return
                "- Name:'" + name + '\'' +
                ", Punctuation: " + punctuation +
                '.';
    }



}
