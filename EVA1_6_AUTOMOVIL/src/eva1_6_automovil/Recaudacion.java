
package eva1_6_automovil;


public class Recaudacion {
    private String marca;
    private String modelo;
    private String placa;
    private int año;
    private String dueño;
    private double adeudo;
    
    //Constructor default
    public Recaudacion(){
        marca = "------";
        modelo = "------";
        placa = "------";
        año = 0;
        dueño = "------";
        adeudo = 0;
    }
    public Recaudacion(String marca1, String modelo1, String placa1, int año1, String dueño1){
        marca = marca1;
        modelo = modelo1;
        placa = placa1;
        año = año1;
        dueño = dueño1;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String valor){
        placa = valor;
    }
    
    public int getAño(){
        return año;
    }
    public void setAño(int valor){
        año = valor;
    }
    
    public String getDueño(){
        return dueño;
    }
    public void setDueño(String valor){
        dueño = valor;
    }
    public void calcularAdeudo(){
        if(año<=2000)
            adeudo = 1500;
        if(año>2000 && año<=2005)
            adeudo = 2000;
        if(año>2005 && año<=2010)
            adeudo = 2500;
        if(año>2010 && año<=2015)
            adeudo = 3000;
        if(año>2015)
            adeudo = 4000;
    }
    public void imprimirDatos(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Placa: "+ placa);
        System.out.println("Año: "+ año);
        System.out.println("Dueño: "+ dueño);
        System.out.println("Adeudo: "+ adeudo);
    }
    
    
    
}
