package problema1;

class Terreno {
    private double costo_terreno;
    private double ancho_terreno;
    private double largo_terreno;
    private double area_terreno;
    private double valorMetroCuadrado;
    
    //Constructor
    public Terreno() {}
    public Terreno(double ancho_terreno,
            double largo_terreno ,
            double valorMetroCuadrado) {
        this.ancho_terreno = ancho_terreno;
        this.largo_terreno = largo_terreno;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    //Metodos SET
    public void setAncho_terreno(double ancho_terreno) {
        this.ancho_terreno = ancho_terreno;
    }
    
    public void setLargo_terreno(double largo_terreno) {
        this.largo_terreno = largo_terreno;
    }
    
    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    
    //Metodos
    public void calcularAreaTerreno() {
        this.area_terreno = this.ancho_terreno * this.largo_terreno;
    }
    
    public void calcularCostoTerreno() {
        this.costo_terreno = this.area_terreno * this.valorMetroCuadrado;
    }
    //Metodos GET
    public double getCosto_terreno() {
        return this.costo_terreno;
    }
    
    public double getAncho_terreno() {
        return this.ancho_terreno;
    }
    
    public double getLargo_terreno() {
        return this.largo_terreno;
    }
    
    public double getArea_terreno() {
        return this.area_terreno;
    }
    
    public double getValorMetroCuadrado() {
        return this.valorMetroCuadrado;
    }
    //Metodo toString
    public String toString() {
        String msj = String.format("DATOS DEL TERRENO \n"
                + "Ancho del Terreno: %.2f\n"
                + "Largo del Terreno: %.2f\n"
                + "Valor del Metro Cuadrado: %.2f\n"
                + "Area del Terreno: %.2f\n"
                + "Costo del Terreno: %.2f\n", this.getAncho_terreno(), this.getLargo_terreno(),this.getValorMetroCuadrado(), this.getArea_terreno(), this.getCosto_terreno());
        return msj;
    }
}

public class Problema1 {
    public static void main(String[] args) {
        Terreno terreno1 = new Terreno(10,2,2);
        terreno1.calcularAreaTerreno();
        terreno1.calcularCostoTerreno();
        System.out.println(terreno1);
    }
}
