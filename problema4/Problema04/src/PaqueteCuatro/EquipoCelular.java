package PaqueteCuatro;

public class EquipoCelular {
    //Atributos
    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String imei;
    //Constructores
    public EquipoCelular(){}
    public EquipoCelular(String sistemaOperativo, double tamanoPantalla, double costoInicial,
                         double ivaPorcentaje, String direccionMac, String imei){
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.imei = imei;
    }
    //Metodos SET
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }
    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }
    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }
    public void calcularIvaCostoInicial() {
        this.ivaCostoInicial = this.costoInicial * this.ivaPorcentaje / (double) 100;
    }
    public void calcularCostoFinal() {
        this.costoFinal = this.costoInicial + this.ivaCostoInicial;
    }
    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }
    //Metodos GET
    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }
    public double getTamanoPantalla() {
        return this.tamanoPantalla;
    }
    public double getCostoInicial() {
        return this.costoInicial;
    }
    public double getIvaPorcentaje() {
        return this.ivaPorcentaje;
    }
    public double getIvaCostoInicial() {
        return this.ivaCostoInicial;
    }
    public double getCostoFinal() {
        return this.costoFinal;
    }
    public String getDireccionMac() {
        return this.direccionMac;
    }
    public String getImei() {
        return this.imei;
    }
    //Metodo toString
    public String toString() {
        String msj;
        msj = String.format("""
                ----- DATOS DEL CELULAR -----
                -Sistema Operativo: %s
                -Tamaño de Pantalla (cm): %.2f
                -Costo Inicial: %.2f
                -Porcentaje de IVA: %.2f
                -IVA (USD): %.2f
                -Costo Final: %.2f
                -Direccion MAC: %s
                -IMEI: %s
                -----------------------------
                """,this.getSistemaOperativo(),
                this.getTamanoPantalla(),
                this.getCostoInicial(),
                this.getIvaPorcentaje(),
                this.getIvaCostoInicial(),
                this.getCostoFinal(),
                this.getDireccionMac(),
                this.getImei());
        return msj;
    }
}
