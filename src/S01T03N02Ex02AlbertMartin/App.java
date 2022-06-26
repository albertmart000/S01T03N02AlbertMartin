package S01T03N02Ex02AlbertMartin;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {

       HashSet<Object> restaurant=  buildHashSetRestaurant();
       shownRestaurant(restaurant);
    }

    private static HashSet<Object> buildHashSetRestaurant() {

        HashSet<Object> restaurant = new HashSet<>();

        restaurant.add(new Restaurant("Japonés",10));
        restaurant.add(new Restaurant("Japonés",3));
        restaurant.add(new Restaurant("Japonés",3));

        restaurant.add(new Restaurant("Pizzeria",10));
        restaurant.add(new Restaurant("Pizzeria",5));
        restaurant.add(new Restaurant("Pizzeria",5));

        restaurant.add(new Restaurant("Kebab",10));
        restaurant.add(new Restaurant("Kebab",10));
        restaurant.add(new Restaurant("Kebab", 3));

        return restaurant;
    }

    private static void shownRestaurant(HashSet<Object> restaurant) {
        System.out.println("La llista de Restaurants és:");
        for (Object restaurants : restaurant) {
            System.out.println(restaurants);
        }
    }

}