
package eva1_12_califas;


public class EVA1_12_CALIFAS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String letra;
        letra = califa(85);
        System.out.println("Califa para 85: "+letra); //usar el metodo y el resultado se guarda en una variable para usarlo después
        System.out.println("Califa para 75: "+califa(75)); //usa el resultado directamente al llamargo y despues se pierde
        califa(100); //invoca la función pero no hace nada
    }
    public static String califa(int valor){
        String letra;
        if(valor>100){
            valor = 100;
        }
        if (valor>90){
            letra = "A";
        }else if (valor>80){
            letra = "B";
        }else if(valor>70){
            letra = "C";
        }else{
            letra = "D";
        }
        return letra;
    }
}
