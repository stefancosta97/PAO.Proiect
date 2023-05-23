package Obiecte;

public class Livrator
{
    private int id;
    private String nume;
    private String telefon;
    private Adresa adresa;

    public Livrator(int id, String nume, String telefon, Adresa adresa)
    {
        this.id = id;
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public Adresa getAdresa() {
        return adresa;
    }
}
