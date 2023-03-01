
package eva1_20_static_2;


public class FormulasGeometria {
    //CONSTANTE:
    public static final double PI = 3.14159265;
    //area
    public static double areaTriangulo(double base, double altura){
        return (base*altura)/2;
    }
    public static double areaCirculo(double radio){
        return PI * radio * radio;
    }
    //perimetro
    public static double perimetroCirculo(double radio){
        return PI*(radio*2);
    }
    //volumen
    public static double volumenEsfera(double radio){
        return (4.0/3.0) * PI * (radio*radio*radio);
    }
}
