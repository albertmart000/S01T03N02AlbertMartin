package S01T03N02Ex01AlbertMartin;

import java.util.Objects;

public class Restaurant {

    private String name;
    private int punctuation;

    public String getName() {
        return name;
    }

    public Restaurant(String name, int punctuation) {
        this.name = name;
        this.punctuation = punctuation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return punctuation == that.punctuation && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, punctuation);
    }

    @Override
    public String toString() {
        return
                "- Name:'" + name + '\'' +
                ", Punctuation: " + punctuation +
                '.';
    }
}
