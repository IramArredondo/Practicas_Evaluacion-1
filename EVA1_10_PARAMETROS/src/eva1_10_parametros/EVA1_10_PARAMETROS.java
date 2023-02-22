
package eva1_10_parametros;


public class EVA1_10_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nPrintln("Hello",3);
    }
    public static void nPrintln(String message, int n){
        for(int i = 0 ; i < n; i++)
            System.out.println(message);
    }
}
