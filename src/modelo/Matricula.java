import java.util.List;

public class Matricula {
    // Atributos
    private Semestre semestre;
    private List<EstudianteCurso> estudianteCurso;
    
    // Constructor
    public Matricula(Semestre semestre, List<EstudianteCurso> estudianteCurso) {
        this.semestre = semestre;
        this.estudianteCurso = estudianteCurso;
    }
    
    // Métodos
    public void cancelarMatricula() {
        // Implementación
    }
    
    public void calcularAprobacion() {
        // Implementación
    }
    
    public void matricularCurso() {
        // Implementación
    }
    
    public void comprobarDisponibilidad() {
        // Implementación
    }
    
    public void definirHorario() {
        // Implementación
    }
    
    // Getters y Setters
    public Semestre getSemestre() {
        return semestre;
    }
    
    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }
    
    public List<EstudianteCurso> getEstudianteCurso() {
        return estudianteCurso;
    }
    
    public void setEstudianteCurso(List<EstudianteCurso> estudianteCurso) {
        this.estudianteCurso = estudianteCurso;
    }
}