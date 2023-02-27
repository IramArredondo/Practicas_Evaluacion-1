
package eva1_18_sobrecarga_rfc;


public class EVA1_18_SOBRECARGA_RFC {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("rfc: "+generarRFC("IRAM", "ARREDONDO", "RAMÍREZ", 2004, 03, 25));
        System.out.println("rfc faltando un apellido: "+generarRFC("IRAM", "ARREDONDO", 2004, 03, 25));
        System.out.println("rfc faltando ambos apellidos: "+generarRFC("IRAM", 2004, 03, 25));
    }
    public static String generarRFC(String nombre, String apPat, String apMat, int año, int mes, int dia){
        //String en java son arreglos
        String ap1 = apPat.charAt(0) + "" ;
        String ap2 = apPat.charAt(1) + "" ;
        String apM = apMat.charAt(0) + "" ;
        String nmb = nombre.charAt(0) + "" ;
        String rfc = ap1 + ap2 + apM + nmb + año + mes + dia + "";
        return rfc;
    }
    //SOBRECARGAR PARA LOS CASOS:
    //FALTE UN APELLIDO --> SUSTITUIR POR UNA X
    //FALTEN AMBOS APELLIDOS --> SUSTITUIR POR XX
    public static String generarRFC(String nombre, String apellido, int año, int mes, int dia){
        //String en java son arreglos
        String ap1 = apellido.charAt(0) + "" ;
        String ap2 = apellido.charAt(1) + "" ;
        String nmb = nombre.charAt(0) + "" ;
        String rfc = ap1 + ap2 + "X" + nmb + año + mes + dia + "";
        return rfc;
    }
    public static String generarRFC(String nombre, int año, int mes, int dia){
        //String en java son arreglos
        String nmb = nombre.charAt(0) + "" ;
        String rfc = "X" + "X" + nmb + año + mes + dia + "";
        return rfc;
    }
}
