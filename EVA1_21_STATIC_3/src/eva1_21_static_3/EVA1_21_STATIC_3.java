
package eva1_21_static_3;


public class EVA1_21_STATIC_3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Prueba.valor);
        Prueba.valor++;
        System.out.println(Prueba.valor);//sí se modificó
        //------------------------------------------------
        System.out.println("");
        System.out.println("AHORA CON OBJETOS");
        //------------------------------------------------
        PruebaObjetos obj = new PruebaObjetos();
        System.out.println(obj.valor);
        obj.valor++;
        System.out.println(obj.valor);
        PruebaObjetos obj2 = new PruebaObjetos();
        System.out.println(obj2.valor);
    }
    
}
class Prueba{
    public static int valor = 100;
}
class PruebaObjetos{
    public int valor = 100;
}
