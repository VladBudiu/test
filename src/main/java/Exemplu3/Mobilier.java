package Exemplu3;

import java.util.List;

public class Mobilier {
    protected String nume;
    protected List<Placa> placi;
    public Mobilier() {};
    public Mobilier(String nume, List<Placa>placi)
    {
        this.nume=nume;
        this.placi=placi;
    }

    @Override
    public String toString() {
        return "\n\nMobilier{\n" +
                "nume='" + nume + '\'' +
                ", \nplaci=" + placi +
                "\n}";
    }

    public static void caracteristiciSpecificePiesaMobilier(String nume, List<Mobilier> lista)
    {
        for(Mobilier m: lista)
        {
            if(m.nume.compareTo(nume)==0)
            {
                System.out.println(m.placi.toString());
            }
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Placa> getPlaci() {
        return placi;
    }

    public void setPlaci(List<Placa> placi) {
        this.placi = placi;
    }
}
