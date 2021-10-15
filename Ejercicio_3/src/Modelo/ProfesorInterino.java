
package Modelo;



public class ProfesorInterino extends Profesor{
    private String Fecha;
    
    
    public ProfesorInterino(String Nom, String Apell, String Id,String Fecha){
        super(Nom, Apell, Id);
        this.Fecha=Fecha;
    }

    public ProfesorInterino(String Id, String Nom, String Apell) {
        super(Id, Nom, Apell);
    }
 


    public String getFecha() {
        return Fecha;
    }


    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    @Override
    public String RetornarDatos(){
        return  "El profesor interino numero 1 se incorporo en la fecha de : "+ this.Fecha;
    }
    
}
