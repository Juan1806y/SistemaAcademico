import java.util.Date;

public class Asistencia {
    // Attributes
    private EstudianteCurso estudianteCurso;
    private Date fecha;
    private String estado;
    private String excusa;
    
    // Constructors
    public Asistencia() {
    }
    
    public Asistencia(EstudianteCurso estudianteCurso, Date fecha, String estado, String excusa) {
        this.estudianteCurso = estudianteCurso;
        this.fecha = fecha;
        this.estado = estado;
        this.excusa = excusa;
    }
    
    // Methods from UML
    public void registrarAsistencia() {
        // Implementation
    }
    
    public void justificarInasistencia() {
        // Implementation
    }
    
    public void cambiarAsistencia() {
        // Implementation
    }
    
    // Getters and Setters
    public EstudianteCurso getEstudianteCurso() {
        return estudianteCurso;
    }
    
    public void setEstudianteCurso(EstudianteCurso estudianteCurso) {
        this.estudianteCurso = estudianteCurso;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getExcusa() {
        return excusa;
    }
    
    public void setExcusa(String excusa) {
        this.excusa = excusa;
    }
}
