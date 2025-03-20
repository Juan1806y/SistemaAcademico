public class Asignacion {
    // Atributos
    private Docente docente;
    private Curso curso;
    private Semestre semestre;
    private int anio;
    
    // Constructor
    public Asignacion(Docente docente, Curso curso, Semestre semestre, int anio) {
        this.docente = docente;
        this.curso = curso;
        this.semestre = semestre;
        this.anio = anio;
    }
    
    // Métodos
    public void asignarDocente() {
        // Implementación
    }
    
    public void verificarDisponibilidad() {
        // Implementación
    }
    
    // Getters y Setters
    public Docente getDocente() {
        return docente;
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public Semestre getSemestre() {
        return semestre;
    }
    
    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }
    
    public int getAnio() {
        return anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
}