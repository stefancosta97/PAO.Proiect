package Obiecte;

import java.util.ArrayList;
import java.util.List;

public class Comanda
{
    private int id;
    private Utilizator utilizator;
    private List<Mancare> mancaruri;
    private double totalPlata;
    private String stare;

    // Constructor
    public Comanda(int id, Utilizator utilizator)
    {
        this.id = id;
        this.utilizator = utilizator;
        mancaruri = new ArrayList<>();
        totalPlata = 0;
        stare = "Neprelucrata";
    }

    // Metode de acces
    public int getId() {
        return id;
    }

    public Utilizator getUtilizator() {
        return utilizator;
    }

    public List<Mancare> getMancaruri() {
        return mancaruri;
    }

    public double getTotalPlata() {
        return totalPlata;
    }

    public String getStare() {
        return stare;
    }

    public void adaugaMancare(Mancare mancare) {
        mancaruri.add(mancare);
        totalPlata += mancare.getPret();
    }

    public void eliminaMancare(Mancare mancare) {
        mancaruri.remove(mancare);
        totalPlata -= mancare.getPret();
    }

    public void setStare(String stare) {
        this.stare = stare;
    }
}
