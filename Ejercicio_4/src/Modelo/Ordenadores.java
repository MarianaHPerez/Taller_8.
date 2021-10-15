package Modelo;

public class Ordenadores {

    private String Codigo;
    private double Precio;

    public Ordenadores() {
    }

    public Ordenadores(String Codigo, double Precio) {
        this.Codigo = Codigo;
        this.Precio = Precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }


    

    public String RetornarDatos() {
        return "Codigo: " + this.Codigo + "\n" +"Precio: " + this.Precio + " Dolares";
    }

}
