package Services;

import Obiecte.Comanda;

import java.util.ArrayList;
import java.util.List;
public class ComandaService
{
    private List<Comanda> comenzi;

    public ComandaService()
    {
        comenzi = new ArrayList<>();
    }

    public void plaseazaComanda(Comanda comanda)
    {
        comenzi.add(comanda);
    }

    public void actualizeazaStareComanda(Comanda comanda, String stare)
    {
        comanda.setStare(stare);
    }
}
