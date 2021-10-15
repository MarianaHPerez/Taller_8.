
package Modelo;



public class Persona {
    
    
    private String Nom, Apell;

    
    
    
    public Persona() {
    }

    public Persona(String Nom, String Apell) {
        this.Nom = Nom;
        this.Apell = Apell;
    }

    
    
    public String getNom() {
        return Nom;
    }

    public String getApell() {
        return Apell;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setApell(String Apell) {
        this.Apell = Apell;
    }
    

    
    public String RetornarDatos(){
        return "Profesor de Nombre" + this.Nom + this.Apell;
        
    }
    
    
    
    
    
    
    
    
}
