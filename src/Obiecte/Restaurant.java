package Obiecte;

public class Restaurant
{
    private int id;
    private String nume;
    private String adresa;
    private Meniu meniu;

    // Constructor
    public Restaurant(int id, String nume, String adresa)
    {
        this.id = id;
        this.nume = nume;
        this.adresa = adresa;
        this.meniu = new Meniu();
    }
    // Metode de acces
    public int getId()
    {
        return id;
    }

    public String getNume()
    {
        return nume;
    }

    public String getAdresa()
    {
        return adresa;
    }

    public Meniu getMeniu()
    {
        return meniu;
    }
}
