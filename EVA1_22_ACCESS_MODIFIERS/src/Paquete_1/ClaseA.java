
package Paquete_1;

import Paquete_2.ClaseE;


public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        ClaseB objB = new ClaseB();
        //objB.publicB; <-- Atributos visibles
        //objB.defaultB; <-----|
        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;
        
        //Clase D es default en otro archivo pero mismo paquete :)
        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;
        
        //Clase E esta en otro paquete
        //Hay que agregar la clausula import
        ClaseE objE = new ClaseE();
        //Solo es posible ver publicE al ser publico, default no al no estar el el mismo paquete.
        //objE.publicE;a
        
        //Clase F es default y es invisible para las clases de este´paquete1
        //ClaseF objF = new ClaseF();
    }
}

class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;
}