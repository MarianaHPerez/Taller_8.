package Modelo;

public abstract class Empleado {

    private String Nombre;
    private int Id;

    public Empleado(String Nombre, int Id) {
        this.Nombre = Nombre;
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getId() {
        return Id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

  
    
    public abstract void Pagar();

}
