
package eva1_17_sobrecarga_areas;


public class EVA1_17_SOBRECARGA_AREAS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Área de un circulo: " + area(5));
        System.out.println("Área de un triangulo: " + area(2, 4));
        System.out.println("Área de un trapecio: " + area(3, 4, 5));
    }
    public static double area(double radio){
        //Area de un circulo
        //PI * r * r
        return Math.PI*radio*radio;
    }
    public static double area(double base, double altura){
        //Area de un triangulo
        //(b*h)/2
        return (base*altura)/2;
    }
    public static double area(double altura, double baseM, double basem){
        //Area de un trapecio
        // [h * ( B + b )]/2
        return (altura*(baseM + basem))/2;
    }
}
