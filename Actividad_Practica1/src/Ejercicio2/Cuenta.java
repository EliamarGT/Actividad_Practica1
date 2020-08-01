package Ejercicio2;

public class Cuenta extends Persona{
    //-------------------------------- ATRIBUTOS -------------------------------
    private long Saldo1;
    //----------------------------- CONSTRUCTOR COMPLETO -----------------------


    public Cuenta(long Saldo1, String DNI, String Estado) {
        super(DNI, Estado);
        this.Saldo1 = Saldo1;
    }
    
    
    //------------------------------SET AND GET --------------------------------
    public long getSaldo1() {
        return Saldo1;
    }

    public void setSaldo1(long Saldo1) {
        this.Saldo1 = Saldo1;
    }
    
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    //---------------------------- METODOS NECESARIOS --------------------------
    public boolean verificarEstado(){
        if(this.Saldo1 < 0){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
