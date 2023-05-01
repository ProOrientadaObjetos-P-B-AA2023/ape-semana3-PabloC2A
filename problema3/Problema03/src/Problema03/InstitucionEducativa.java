package Problema03;

public class InstitucionEducativa {
    //Atributos
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoPorEstudiante;
    private double presupuesto;
    //Constructores
    public InstitucionEducativa(){}
    public InstitucionEducativa(String nombre, String tipoInstitucion, int numeroAlumnos,
                                int numeroDocentes, int numeroSedes, double gastoPorEstudiante,
                                double presupuesto){
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastoPorEstudiante = gastoPorEstudiante;
        this.presupuesto = presupuesto;
    }
    //Metodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }
    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }
    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }
    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }
    public void setGastoPorEstudiante(double gastoPorEstudiante) {
        this.gastoPorEstudiante = gastoPorEstudiante;
    }
    public void calcularPresupuesto() {
        this.presupuesto = this.numeroAlumnos * this.gastoPorEstudiante;
    }
    //Metodos GET
    public String getNombre() {
        return this.nombre;
    }
    public String getTipoInstitucion() {
        return this.tipoInstitucion;
    }
    public int getNumeroAlumnos() {
        return this.numeroAlumnos;
    }
    public int getNumeroDocentes() {
        return this.numeroDocentes;
    }
    public int getNumeroSedes() {
        return this.numeroSedes;
    }
    public double getGastoPorEstudiante() {
        return this.gastoPorEstudiante;
    }
    public double getPresupuesto() {
        return this.presupuesto;
    }
    //Metodo toString
    public String toString() {
        String msj;
        msj = String.format("""
                ----- DATOS DE LA INSTITUCION -----
                -Nombre: %s
                -Tipo de Institucion: %s
                -Numero de Alumnos: %d
                -Numero de Docentes: %d
                -Numero de Sedes: %d
                -Gastos Proyectados por Estudiante: %.2f
                -Presupuesto: %.2f
                -----------------------------------
                """,this.getNombre(), this.getTipoInstitucion(), this.getNumeroAlumnos(), this.getNumeroDocentes(), this.getNumeroSedes(), this.getGastoPorEstudiante(), this.getPresupuesto());
        return msj;
    }
}
