import java.util.List;

public class Asignatura {
    // Attributes
    private String nombre;
    private List<Asignatura> prerrequisitos;
    private int codigo;
    private int semestre;
    private int horas;
    private String tipoAsignatura;
    
    // Constructor
    public Asignatura() {
    }
    
    public Asignatura(String nombre, List<Asignatura> prerrequisitos, int codigo, int semestre, int horas, String tipoAsignatura) {
        this.nombre = nombre;
        this.prerrequisitos = prerrequisitos;
        this.codigo = codigo;
        this.semestre = semestre;
        this.horas = horas;
        this.tipoAsignatura = tipoAsignatura;
    }
    
    // Methods from UML
    public void agregarPrerrequisito() {
        // Implementation
    }
    
    public void eliminarPrerrequisito() {
        // Implementation
    }
    
    public void modificarAsignatura() {
        // Implementation
    }
    
    // Getters and Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Asignatura> getPrerrequisitos() {
        return prerrequisitos;
    }
    
    public void setPrerrequisitos(List<Asignatura> prerrequisitos) {
        this.prerrequisitos = prerrequisitos;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getSemestre() {
        return semestre;
    }
    
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public int getHoras() {
        return horas;
    }
    
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public String getTipoAsignatura() {
        return tipoAsignatura;
    }
    
    public void setTipoAsignatura(String tipoAsignatura) {
        this.tipoAsignatura = tipoAsignatura;
    }
}
