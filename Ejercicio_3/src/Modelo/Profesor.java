
package Modelo;



public class Profesor extends Persona {
    private String Id;



    public Profesor(String Id, String Nom, String Apell) {
        super(Nom, Apell);
        this.Id = Id;
    }
    
    

    public Profesor(String Nom, String Apell){
        super(Nom,Apell);
          
    }



    @Override
    public String RetornarDatos(){
        return super.RetornarDatos()+ " Con una Id de profesor: " + "Pro" + this.Id; 
    }
    
    
    
    
    
}
