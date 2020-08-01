
package Ejercicio2;

public abstract class Persona {
    //------------------------------ ATRIBUTOS ---------------------------------
    protected String DNI;
    protected String Estado;
    
    //------------------------------ CONSTRUCTOR -------------------------------
    public Persona(String DNI, String Estado) {
        this.DNI = DNI;
        this.Estado= Estado;
    }

    
    //----------------------------- SET AND GET --------------------------------
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

  
    //--------------------------- METODOS NECESARIOS ---------------------------

}
