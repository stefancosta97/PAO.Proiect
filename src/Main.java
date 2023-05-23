import Obiecte.*;
import Services.ComandaService;
import Services.RestaurantService;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Exemplu de utilizare a claselor si serviciilor definite mai sus
        RestaurantService restaurantService = new RestaurantService();
        ComandaService comandaService = new ComandaService();

        // Creare si adaugare restaurant
        Restaurant restaurant1 = new Restaurant(1, "Restaurant 1", "Adresa 1");
        Restaurant restaurant2 = new Restaurant(2, "Restaurant 2", "Adresa 2");
        Restaurant restaurant3 = new Restaurant(3, "Restaurant 3", "Adresa 3");
        restaurantService.adaugaRestaurant(restaurant1);

        // Creare si adaugare meniu pentru restaurant
        Meniu meniu1 = new Meniu();
        Mancare mancare1 = new Mancare(1, "Mancare 1", 10.0);
        Mancare mancare2 = new Mancare(2, "Mancare 2", 15.0);
        meniu1.adaugaMancare(mancare1);
        meniu1.adaugaMancare(mancare2);
        restaurant1.getMeniu().adaugaMancare(mancare1);
        restaurant1.getMeniu().adaugaMancare(mancare2);

        // Creare si adaugare utilizator
        Utilizator utilizator1 = new Utilizator(1, "Utilizator 1");

        // Plasare comanda
        Comanda comanda1 = new Comanda(1, utilizator1);
        comanda1.adaugaMancare(mancare1);
        comanda1.adaugaMancare(mancare2);
        comandaService.plaseazaComanda(comanda1);

        // Actualizare stare comanda
        comandaService.actualizeazaStareComanda(comanda1, "Preparata");

        // Afisare meniu pentru restaurant
        List<Mancare> meniuRestaurant1 = restaurant1.getMeniu().getMancaruri();
        for (Mancare mancare : meniuRestaurant1)
        {
            System.out.println(mancare.getNume() + " - " + mancare.getPret());
        }

        // Afisare istoric comenzi pentru utilizator
        List<Comanda> comenziUtilizator1 = utilizator1.getComenzi();
        for (Comanda comanda : comenziUtilizator1)
        {
            System.out.println("Obiecte.Comanda " + comanda.getId() + ": " + comanda.getStare());
        }
        // Creare adresa
        Adresa adresa = new Adresa("Strada X", "Orasul Y", "Judetul Z", "12345");

        // Creare livrator
        Livrator livrator = new Livrator(1, "Livrator 1", "1234567890", adresa);

        // Creare rating
        Rating rating = new Rating(1, 5, "Serviciu excelent!");

        // Exemplu de utilizare a claselor Adresa, Livrator si Rating
        System.out.println("Detalii livrator:" + livrator.getNume());
        System.out.println("Telefon: " + livrator.getTelefon());
        System.out.println("Adresa: " + livrator.getAdresa().getStrada() + ", " +
                livrator.getAdresa().getOras() + ", " + livrator.getAdresa().getJudet() +
                ", " + livrator.getAdresa().getCodPostal());

        System.out.println("Detalii rating:" + rating.getComentariu());
        System.out.println("Punctaj: " + rating.getPunctaj());

    }
}