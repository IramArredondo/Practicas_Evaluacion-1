
package eva1_13_alcance;


public class EVA1_13_ALCANCE {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;//visible para todo lo que este dentro de main()
        for(int i = 0; i < 10; i++){//inicio del ciclo for
            //variable i es visible en todo el ciclo for
            System.out.println("x = "+ x); //variable declarada en el método main (visible en el for)
            System.out.println("i = " + i);
            System.out.println("j = " + j);//Variable que no es visible
                                           //No esta declarada antes de la instrucción
            int j = 100; //a partir de aquí es visible la variable j
            System.out.println("j = " + j);
            {
                int z = 1000;
                System.out.println("z = " + z);
            }
            System.out.println("z = " + z);
        }//termina el ciclo for
        System.out.println("i = " + i); //no estan declaradas en el bloque main
        System.out.println("j = " + j); //no estan declaradas en el bloque main
    }
    public static void algo(){
        System.out.println("x = " + x);//variable declarada en el main
    }
    
}
