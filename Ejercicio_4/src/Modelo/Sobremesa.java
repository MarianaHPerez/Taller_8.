package Modelo;

import Modelo.Ordenadores;

public class Sobremesa extends Ordenadores {

    private String TipoTorre;
    private String Slogan;


    public Sobremesa(String TipoTorre, String Slogan, String Codigo, double Precio) {
        super(Codigo, Precio);
        this.TipoTorre = TipoTorre;
        this.Slogan = Slogan;
    }

    public Sobremesa(String TipoTorre, String Slogan) {
        this.TipoTorre = TipoTorre;
        this.Slogan = Slogan;
    }
    public String getTipoTorre() {
        return TipoTorre;
    }

    public String getSlogan() {
        return Slogan;
    }

    public void setTipoTorre(String TipoTorre) {
        this.TipoTorre = TipoTorre;
    }

    public void setSlogan(String Slogan) {
        this.Slogan = Slogan;
    }


    @Override
    public String RetornarDatos() {
        return super.RetornarDatos() + "\nTipo Torre: " + this.TipoTorre
                + "\n" + "Eslogan: " + this.Slogan;

    }
}
