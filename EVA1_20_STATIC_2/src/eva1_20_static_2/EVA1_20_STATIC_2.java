
package eva1_20_static_2;


public class EVA1_20_STATIC_2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        final int x;
        x = 100;
        x = 200;
        */
        FormulasGeometria fg = new FormulasGeometria();
        //fg. de nada nos sirve el objeto al ser static
        System.out.println("Mi PI: "+FormulasGeometria.PI);
        System.out.println("Área triángulo: "+FormulasGeometria.areaTriangulo(5, 5));
        System.out.println("Volumen de una esfera: "+FormulasGeometria.volumenEsfera(10));
        
    }
    
}
