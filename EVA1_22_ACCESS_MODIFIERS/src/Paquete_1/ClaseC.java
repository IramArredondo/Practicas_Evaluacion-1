
package Paquete_1;

import Paquete_2.ClaseE;


public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.defaultA;
        //objA.publicA;
         ClaseB objB = new ClaseB();
        //objB.publicB; <-- Atributos visibles
        //objB.defaultB; <-----|
        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;

        
        //Clase E esta en otro paquete
        //Hay que agregar la clausula import
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        
    }
}

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}
