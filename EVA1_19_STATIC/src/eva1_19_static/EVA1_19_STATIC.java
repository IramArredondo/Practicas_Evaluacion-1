
package eva1_19_static;


public class EVA1_19_STATIC {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PI "+Math.PI);
        System.out.println("Número aleatorio: " + Math.random());
        //creación del objeto
        Utilerias utileria = new Utilerias();
        utileria.Saludo();
        Utilerias.otroSaludo();
        Saludo2();//SI NO ESTA ESTATICO Y NO SE HA CREADOR UN OBJETO    
                  //EL MÉTODO NO EXISTE
        //NO SE PUEDEN USAR COSAS NO STATIC EN METODOS STATIC
        //todo lo static java lo crea por si solo
        
    }
    public void Saludo2(){
        System.out.println("HOLA");
    }
    
}
//no se pueden crear clases publicas fuera de su archivo propio
class Utilerias{
    //Saludo(){} ESTE MÉTODO EXISTE HASTA QUE SE CREA UN OBJETO DE LA CLASE
    //SOLO SE USA A TRAVÉS DE UN OBJETO
    public void Saludo(){
        System.out.println("Hola!!");
    }
    //otro saludo(): ESTE MÉTODO EXISTE EN EL MOMENTO QUE EL PROGRAMA
    //INICIA SU EJECUCIÓN, NO NECESITA QUE SE CREE UN OBJETO DE LA CLASE PARA PODERLO UTILIZAR
    //SE USA A TRAVÉS DE LA CLASE.
    public static void otroSaludo(){
        System.out.println("Otro saludo (static)");
    }
}