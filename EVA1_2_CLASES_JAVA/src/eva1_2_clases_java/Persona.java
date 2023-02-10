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
public class Persona {
    //Estilo --> Tener cuidado con no se muy largo o ambiguo

    //Atributos/datos de la clase -->(ESTADO) datos de una persona
    //Métodos: comportamiento
    private String nombre;
    private String apellido;
    private int edad;
    private boolean estadoCivil;
    //CamelCase --> primera miniscula - Segunda Mayuscula

    //  lectura              y        escritura               de atributos.
    //métodos get --> leer   y   método set --> escribir
    //Metodos:
    //modificador valor de retorno nombre (argumentos)(implementación)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        //void no espero que regrese nada
        nombre = valor;
    }

    // get y set nos permite usar el dato private
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String valor) {
        apellido = valor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }

    public boolean getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean valor) {
        estadoCivil = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Datos almacenados:");
        //Concatenación
        //" + " puede ser para sumar numeros y CONCATENAR textos <-- Sobrecarca de operadores (más funciones a las que tiene originalmente)
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        if (estadoCivil){
            //Por default el booleano es true
            System.out.println("Estado civil: casado" );
        }else{
            //Acá va a ser false el boolean
            System.out.println("Estado civil: soltero" );
        }
        
    }
}
