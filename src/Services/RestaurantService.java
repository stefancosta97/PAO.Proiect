package Services;

import Obiecte.Restaurant;

import java.util.ArrayList;
import java.util.List;
public class RestaurantService
{
    private List<Restaurant> restaurante;

    public RestaurantService()
    {
        restaurante = new ArrayList<>();
    }

    public void adaugaRestaurant(Restaurant restaurant)
    {
        restaurante.add(restaurant);
    }

    public void eliminaRestaurant(Restaurant restaurant)
    {
        restaurante.remove(restaurant);
    }

    public List<Restaurant> cautaRestaurante(String criterii)
    {
        return null;
    }
}
