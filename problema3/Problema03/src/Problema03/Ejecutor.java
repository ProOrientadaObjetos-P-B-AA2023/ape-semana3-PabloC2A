package Problema03;

public class Ejecutor {
    public static void main(String[] args) {
        InstitucionEducativa InstitucionEducativa1 = new InstitucionEducativa("Mater Dei","Fiscomisional",2500,49,1,45.92,125);
        InstitucionEducativa InstitucionEducativa2 = new InstitucionEducativa("Bernardo Valdivieso","Publica",6750,62,1,41.25,100);
        InstitucionEducativa1.calcularPresupuesto();
        InstitucionEducativa2.calcularPresupuesto();
        System.out.println(InstitucionEducativa1);
        System.out.println(InstitucionEducativa2);
    }
}
