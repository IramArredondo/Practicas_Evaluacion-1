
package eva1_16_sobrecarga_2;


public class EVA1_16_SOBRECARGA_2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Suma: " + suma(4, 5));
        System.out.println("Suma: " + suma(4.0, 5.0));
        System.out.println("Suma: " + suma("Hola ", "mundo!!"));
        suma();
    }//mismo metodo, diversas funciones --> SOBRECARGA 0_o
                      //sumar(int, int) <-- firma del método
    public static int suma(int val1,int val2){
        return val1 + val2;
    }
                        //suma(double, double) <-- firma del método
    public static double suma(double val1,double val2){
        return val1 + val2;
    }
    //metodos distintos --> SOBRECARGA
                        //suma(String, String) <-- firma del método
    public static String suma(String val1,String val2){
        return val1 + val2;
    }
    public static void suma(){
        System.out.println("Método sin parámetros suma");
    }
    /*
    public static int sumar(int x, int y){
        return x+y;
    }
    */
}
