package Obiecte;

public class Adresa
{
    private String strada;
    private String oras;
    private String judet;
    private String codPostal;
    public Adresa(String strada, String oras, String judet, String codPostal)
    {
        this.strada = strada;
        this.oras = oras;
        this.judet = judet;
        this.codPostal = codPostal;
    }

    public String getStrada() {
        return strada;
    }

    public String getOras() {
        return oras;
    }

    public String getJudet() {
        return judet;
    }

    public String getCodPostal() {
        return codPostal;
    }
}
