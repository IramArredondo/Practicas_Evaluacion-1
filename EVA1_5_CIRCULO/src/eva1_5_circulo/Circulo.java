
package eva1_5_circulo;


public class Circulo {
    private double area;
    private double perimetro;
    private double radio;
    
    public Circulo(){
        radio = 3;
        area = 0;//(Math.PI*(radio*radio));
        perimetro = 0;//(Math.PI*(radio*2));
    }
    
    //------------------------------------------
    
    public Circulo(double radio2){
        radio = radio2;
    }
    
    //------------------------------------------
    
    public double getRadio(){
        return radio;
    }
    public void setRadio (double valor){
        radio = valor;
    }
    public void obtenerArea(){
        area = (Math.PI*(radio*radio));
    }
    public void obtenerPerimetro(){
        perimetro = (Math.PI*(radio*2));
    }
    public double getArea(){
        return area;
    }
    public void setArea(double valor){
        area = valor;
    }
    public double getPerimetro(){
        return perimetro;
    }
    public void setPerimetro(double valor){
        perimetro = valor;
    }
    
    //----------------------------------------
    

    
}
