
package eva1_3_constructores;


public class CuentaBancaria { // <-- debe tener el mismo nombre que el que se dio a la clase
    //atributos de la clase
    private String noCuenta;
    private double saldo;
    private String cliente;
    //Constructores
    //default y con argumentos
    public CuentaBancaria(){ // <-- constructor default
        noCuenta = "------";
        saldo = 0;
        cliente = "------";
    }
    //Cada argumento se tiene que especificar el tipo de dato
    //Aunque tienen el mismo nombre, la diferencía el argumento
    public CuentaBancaria(String nCuenta, double otroSaldo, String nCliente){
        noCuenta = nCuenta;
        saldo = otroSaldo;
        cliente = nCliente;
    }
    
    //comportamiento
    //métodos get y set
    //Public <-- poder ser usado
    public String getNoCuenta(){
    //get <-- nos va a devolver un valor (por ello se pone String)
        return noCuenta;
        // si nos va a devolver un valor es obligatorio el return.-
    }
    public void setNoCuenta(String valor){
        noCuenta = valor;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double valor){
        saldo = valor;
    }
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String valor){
        cliente = valor;
    }
    public void imprimirDatos(){
        System.out.println("Datos almacenados:");
        System.out.println("Cliente: " + cliente);
        System.out.println("Número de cuenta: " + noCuenta);
        System.out.println("Saldo: peras -->" + saldo);
        
    }
}
