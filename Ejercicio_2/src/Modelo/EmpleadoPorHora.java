package Modelo;



public class EmpleadoPorHora extends Empleado {

    private double Salario;
    private int Hora;

    public EmpleadoPorHora(double Salario, int Hora, String Nombre, int Id) {
        super(Nombre, Id);
        this.Salario = Salario;
        this.Hora = Hora;
    }

    public double getSalario() {
        return Salario;
    }

    public int getHora() {
        return Hora;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

   

    @Override
    public void Pagar() {

        if (Hora <= 39) {
            Salario = getHora() * 2500;
            System.out.println("Su salario es de: " + Salario);
        }

        if (Hora >= 40) {
            Salario = getHora() * 3750;
            System.out.println("Su salario es: " + Salario);
        }

    }

}
