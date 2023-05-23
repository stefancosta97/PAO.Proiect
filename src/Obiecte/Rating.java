package Obiecte;

public class Rating
{
    private int id;
    private int punctaj;
    private String comentariu;
    public Rating(int id, int punctaj, String comentariu)
    {
        this.id = id;
        this.punctaj = punctaj;
        this.comentariu = comentariu;
    }

    public int getId() {
        return id;
    }

    public int getPunctaj() {
        return punctaj;
    }

    public String getComentariu() {
        return comentariu;
    }
}
