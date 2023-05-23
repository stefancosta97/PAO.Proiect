package Obiecte;

public class Mancare
{
    private int id;
    private String nume;
    private double pret;

    // Constructor
    public Mancare(int id, String nume, double pret)
    {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
    }

    // Metode de acces
    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }
}
