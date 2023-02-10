/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clases_java;

/**
 *
 * @author IramA
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CLASE ES UNA RECETA:
        //OBJETO ES EL PLATILLO
        //INSTANCIACIÓN;

        //Creacion de un objeto en JAVA:
        //1. Declarar el identificador para el objeto
        //2. Asignar memoria con el new
        //3. Invocar su constructor
        Persona perso1 = new Persona();
        //"New" asigna un nuevo espacio en la memoria
        //Persona --> constructor de la clase.
        //constructor --> método.
        //Ubicacion del objeto perso en la memoria --> System.out.println(perso1);

        /*
        
        //Atributos con modificador DEFAULT
        perso1.nombre = "Iram";
        perso1.apellido = "Arredondo";
        perso1.edad = 18;
        perso1.estadoCivil = true; //true --> casado
        //El " . " nos permite trasladarnos a otra clase
        //perso1 interfaz son sus metodos (nombre, apellido, etc).
        
        System.out.println(perso1.nombre);
        
         */
        perso1.setNombre("Iram");
        perso1.setApellido("Arredondo");
        perso1.setEdad(18);
        perso1.setEstadoCivil(false);
        /*
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getEstadoCivil());
        */
        perso1.imprimirDatos();
        System.out.println("");
        //PERSONA 2
        //Creación del objeto
        Persona perso2 = new Persona();
        //Mismo procedimiento solo que con "perso2"
        perso2.setNombre("Luis Carlos");
        perso2.setApellido("Meza López");
        perso2.setEdad(36);
        perso2.setEstadoCivil(true);
        
        perso2.imprimirDatos();
    }

}
