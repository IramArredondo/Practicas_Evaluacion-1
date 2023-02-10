
package eva1_3_constructores;


public class EVA1_3_CONSTRUCTORES {

    
    public static void main(String[] args) {
        CuentaBancaria cta1 = new CuentaBancaria("22550296A0", 50, "Iram Arredondo");
        //Atributos --> variables de la clase
        /*
        cta1.setCliente("Iram Arredondo");
        cta1.setNoCuenta("ES123456789");
        cta1.setSaldo(0.35);
        */
        //cta1.imprimirDatos();
        
        System.out.println("DATOS DEL CLIENTE");
        String nombre = cta1.getCliente();
        System.out.println(nombre);
        System.out.println(cta1.getNoCuenta());
        System.out.println(cta1.getSaldo());
        //------------------------------------
        CuentaBancaria cta2 = new CuentaBancaria("22550287A0", 1102, "David Alberto");
        System.out.println("");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cta2.getCliente());
        System.out.println(cta2.getNoCuenta());
        System.out.println(cta2.getSaldo());
        //------------------------------------------
        CuentaBancaria cta3 = new CuentaBancaria();
        System.out.println("");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cta3.getCliente());
        System.out.println(cta3.getNoCuenta());
        System.out.println(cta3.getSaldo());
    }
    
}
