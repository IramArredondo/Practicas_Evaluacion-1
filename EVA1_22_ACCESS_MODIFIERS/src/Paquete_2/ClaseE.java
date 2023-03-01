
package Paquete_2;

import Paquete_1.ClaseA;
import Paquete_1.ClaseC;


public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
    public void prueba(){
        //Se importa la claseA del paquete1 para utilizar el objeto publico
        ClaseA objA = new ClaseA();
        //objA.publicA;
        
        //No es posible usar el objetoB al ser default y estar en el paquete1
        //ClaseB objB = new ClaseB();
        
        //Se importa la claseC del paquete1 para utilizar el objeto public
        ClaseC objC = new ClaseC();
        //objC.publicC;
        
        //no es posible ver el objetoD al ser default y estar en el paquete1
        //ClaseD objD = new ClaseD();
        
        //Es posible ver los objetos del objetoF al estar en el mismo paquete
        ClaseF objF = new ClaseF();
        //objF.defaultF;
        //objF.publicF;
    }
}

class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;
}
