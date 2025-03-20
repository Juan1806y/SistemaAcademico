import java.util.List;
import java.util.Map;

public class EstudianteCurso {
    // Atributos
    private Curso curso;
    private Estudiante estudiante;
    private List<Asistencia> asistencias;
    private Map<String, Calificacion> calificaciones;
    private String estado; // (Aprobado, cursando, perdido)
    private boolean habilitacion;
    
    // Constructor
    public EstudianteCurso(Curso curso, Estudiante estudiante, List<Asistencias> asistencias,
                           Map<String, Calificacion> calificaciones, String estado, boolean habilitacion) {
        this.curso = curso;
        this.estudiante = estudiante;
        this.asistencias = asistencias;
        this.calificaciones = calificaciones;
        this.estado = estado;
        this.habilitacion = habilitacion;
    }
    
    // Métodos
    public void agregarAsistencia() {
        // Implementación
    }
    
    public void calcularDefinitiva() {
        // Implementación
    }
    
    public void comprobarRehabilitacion() {
        // Implementación
    }
    
    // Getters y Setters
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public List<Asistencia> getAsistencias() {
        return asistencias;
    }
    
    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }
    
    public Map<String, Calificacion> getCalificaciones() {
        return calificaciones;
    }
    
    public void setCalificaciones(Map<String, Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public boolean isHabilitacion() {
        return habilitacion;
    }
    
    public void setHabilitacion(boolean habilitacion) {
        this.habilitacion = habilitacion;
    }
}