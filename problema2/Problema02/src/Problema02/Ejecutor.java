package Problema02;

public class Ejecutor {
    public static void main(String[] args) {
        //Objeto 1
        EquivalenteHora EquivalenteHora1 = new EquivalenteHora(48);
        EquivalenteHora1.calcularMinutos();
        EquivalenteHora1.calcularSegundos();
        EquivalenteHora1.calcularDias();
        System.out.println(EquivalenteHora1);
        //Objeto 2
        EquivalenteHora EquivalenteHora2 = new EquivalenteHora(12.7);
        EquivalenteHora2.calcularMinutos();
        EquivalenteHora2.calcularSegundos();
        EquivalenteHora2.calcularDias();
        System.out.println(EquivalenteHora2);
    }
}
