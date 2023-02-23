
package eva1_11_return_1;


public class EVA1_11_RETURN_1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int resu;
        resu = square(10);//invocación o  llamada a función
        System.out.println("Resultado = " + resu);
    }
    
    public static int square(int num){
        return num * num;
    }
}
