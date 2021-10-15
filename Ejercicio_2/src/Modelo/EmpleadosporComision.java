
package Modelo;



public class EmpleadosporComision extends Empleado {
    
    private double Salario = 30.000;
    private double Porcentaje;
    
    public EmpleadosporComision(String Nombre, int Id,double sal, double por){
        super(Nombre,Id);
        this.Porcentaje=Salario;
        this.Salario=Salario;
    }

    public double getSalario() {
        return Salario;
    }

    public double getPorcentaje() {
        return Porcentaje;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public void setPorcentaje(double Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    
    
    public void Pagar(){
        Salario = getPorcentaje()*0.3;
        double sal = getPorcentaje()-Salario;
        System.out.println("Salario" + sal);
    }
    
}
