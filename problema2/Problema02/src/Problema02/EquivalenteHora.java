package Problema02;

public class EquivalenteHora{
    //Atributos
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    //Constructores
    public EquivalenteHora(){}
    public EquivalenteHora(double horas){
        this.horas = horas;
    }
    //Metodos SET
    public void setHoras(double horas) {
        this.horas = horas;
    }
    public void calcularMinutos() {
        this.minutos = this.horas * (double) 60;
    }
    public void calcularSegundos() {
        this.segundos = this.horas * (double) 60 * (double) 60;
    }
    public void calcularDias() {
        this.dias = this.horas / (double) 24;
    }
    //Metodos GET
    public double getHoras() {
        return this.horas;
    }
    public double getMinutos() {
        return this.minutos;
    }
    public double getSegundos() {
        return this.segundos;
    }
    public double getDias() {
        return this.dias;
    }
    //Metod toString
    public String toString() {
        String msj = String.format("""
                ----- EQUIVALENCIA DE HORAS EN MINUTOS - SEGUNDOS - DIAS -----
                -Horas introducidas: %.2f
                -Minutos: %.2f
                -Segundos: %.2f
                -Dias: %.2f
                ---------------------------------------------------------------
                """,this.getHoras(), this.getMinutos(), this.getSegundos(), this.getDias());
        return msj;
    }
}
