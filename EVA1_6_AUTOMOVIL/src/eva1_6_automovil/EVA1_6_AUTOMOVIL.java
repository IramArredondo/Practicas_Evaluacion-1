
package eva1_6_automovil;


public class EVA1_6_AUTOMOVIL {

    
    public static void main(String[] args) {
        Recaudacion r1 = new Recaudacion();
        r1.calcularAdeudo();
        r1.imprimirDatos();
        
        //-----------------------------------------------
        System.out.println("");
        Recaudacion r2 = new Recaudacion("Honda", "Honda CR-V", "AAA-00-00", 2009, "Iram Arredondo");
        r2.calcularAdeudo();
        r2.imprimirDatos();
        //-----------------------------------------------
        System.out.println("");
        Recaudacion r3 = new Recaudacion("BMW", "BMW Z4", "BBB-00-01", 2000, "jefferson Gutierritos");
        r3.setAño(2022);
        r3.calcularAdeudo();
        r3.imprimirDatos();
    }
    
}
