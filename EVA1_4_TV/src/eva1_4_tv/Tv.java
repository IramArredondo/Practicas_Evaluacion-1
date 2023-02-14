
package eva1_4_tv;


public class Tv {
    private int volumen;
    private int canal;
    private boolean power;
    //Constructores
    public Tv(){ // <-- constructor default
        volumen = 0;
        canal = 98;
        power = false;// <-- apagado
    }
    //métodos requierien un modificador de acceso
    //los métodos no regresan un valor
    //métodos para operar la TV (interfaz)
    
    //encender y apagar la TV
    public void cambiarEstadoPower(){
        //verificar el estado de la TV;
        if(power == true){
            //Si hay más de dos instrucciones usar llaves para indicar que le pertenece al true
            power = false;
            System.out.println("Apagando pantalla");
        }else{
            power = true;
            System.out.println("Encendiendo pantalla");
        }
    }
    //volumen
    public void subirVolumen(){
        //verificar que la TV esta encendida
        if(power == true){// <-- if(poder) "tambien funciona al usar true"
            //limites de 0 a 100 en el volumen
            if(volumen < 100){
                volumen = volumen+1;//acumulador
                //volumen++;
                //volumen+=1;
                System.out.println("Volumen: " + volumen);
            }
        }
    }
    public void bajarVolumen(){
        //verificar que la TV este encendida
        if(power == true){
            //limites de 0 a 100 en el volumen
            if(volumen > 0){
                volumen = volumen-1;
                //volumen--;
                //volumen-=1;
                System.out.println("Volumen: " + volumen);
            }
        }
    }
    public void subirCanal(){
        if(power == true){
            if(canal < 100){
                canal++;
                System.out.println("Canal: " + canal);
            }
            //si el canal llega a 100 el siguiente numero es 0
            if(canal == 100){
                canal=0;
                System.out.println("Canal: " + canal);
            }
        }
    }
    public void bajarCanal(){
        if(power == true){
            if(canal > 0){
                canal--;
                System.out.println("Canal: " + canal);
            }
            //si el canal llega a 0 el siguiente nivel para abajo es 100
            if(canal == 0){
                canal=100;
                System.out.println("Canal: " + canal);
            }
        }
    }
}
