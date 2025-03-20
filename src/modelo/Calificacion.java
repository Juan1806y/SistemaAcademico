import java.util.Date;

public class Calificacion {
    // Attributes
    private String nombre;
    private Date fecha;
    private String tipo;
    private float nota;
    private EstudianteCurso estudianteCurso;
    
    // Constructors
    public Calificacion() {
    }
    
    public Calificacion(String nombre, Date fecha, String tipo, float nota, EstudianteCurso estudianteCurso) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        this.nota = nota;
        this.estudianteCurso = estudianteCurso;
    }
    
    // Methods from UML
    public void modificarEvaluacion() {
        // Implementation
    }
    
    public void eliminarEvaluacion() {
        // Implementation
    }
    
    public String obtenerDetalles() {
        // Implementation
        return "";
    }
    
    public void calificar() {
        // Implementation
    }
    
    // Getters and Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public float getNota() {
        return nota;
    }
    
    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public EstudianteCurso getEstudianteCurso() {
        return estudianteCurso;
    }
    
    public void setEstudianteCurso(EstudianteCurso estudianteCurso) {
        this.estudianteCurso = estudianteCurso;
    }
}