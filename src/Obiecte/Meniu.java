package Obiecte;

import java.util.ArrayList;
import java.util.List;
public class Meniu
{
    private List<Mancare> mancaruri;

    // Constructor
    public Meniu() {
        mancaruri = new ArrayList<>();
    }

    public void adaugaMancare(Mancare mancare)
    {
        mancaruri.add(mancare);
    }

    public void eliminaMancare(Mancare mancare) {
        mancaruri.remove(mancare);
    }

    public List<Mancare> getMancaruri() {
        return mancaruri;
    }
}
