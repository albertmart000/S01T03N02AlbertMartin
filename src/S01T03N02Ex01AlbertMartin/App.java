package S01T03N02Ex01AlbertMartin;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {

    //Construïm i mostrem la llista dels restaurants. Com que un HashSet no permet tenir cap element igual,
    //quan mostrem la llista per pantalla els elements repetits només surten una vegada.
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
        restaurant.add(new Restaurant("Kebab",3));

        return restaurant;
    }

    private static void shownRestaurant(HashSet<Object> restaurant) {
        System.out.println("La llista de Restaurants és:");
        for (Object restaurants : restaurant) {
            System.out.println(restaurants);
        }
    }

}