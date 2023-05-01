package PaqueteCuatro;

public class Ejecutor {
    public static void main(String[] args) {
        EquipoCelular EquipoCelular1 = new EquipoCelular("Android",14.24,280,12,"1a:bc:8d:f0:ed:5b","457164896214567");
        EquipoCelular EquipoCelular2 = new EquipoCelular("Android",19.24,500,12,"4a:bc:9d:f0:ed:2b","257164654214569");
        EquipoCelular1.calcularIvaCostoInicial();
        EquipoCelular1.calcularCostoFinal();
        EquipoCelular2.calcularIvaCostoInicial();
        EquipoCelular2.calcularCostoFinal();
        System.out.println(EquipoCelular1);
        System.out.println(EquipoCelular2);
    }
}
