package Modelo;



public class Portatil extends Ordenadores {

    private double Peso;
    private String Slogan;

    

    public Portatil(double Peso, String Slogan, String Codigo, double Precio) {
        super(Codigo, Precio);
        this.Peso = Peso;
        this.Slogan = Slogan;
    }
    
    public Portatil(double Peso, String Slogan) {
        this.Peso = Peso;
        this.Slogan = Slogan;
    }

    public double getPeso() {
        return Peso;
    }

    public String getSlogan() {
        return Slogan;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setSlogan(String Slogan) {
        this.Slogan = Slogan;
    }






    @Override
    public String RetornarDatos() {
        return super.RetornarDatos()
                + "\n" + "Peso: " + this.Peso + "Kg"
                + "\n" + "Eslogan: " + this.Slogan;

    }

}
