import java.util.List;

public class Docente {
    // Atributos
    private long codigoDocente;
    private String experiencia;
    private Programa programa;
    private Persona persona;
    private List<Asignacion> asignaciones;
    
    // Constructor
    public Docente(long codigoDocente, String experiencia, Programa programa, 
                  Persona persona, List<Asignacion> asignaciones) {
        this.codigoDocente = codigoDocente;
        this.experiencia = experiencia;
        this.programa = programa;
        this.persona = persona;
        this.asignaciones = asignaciones;
    }
    
    // Métodos
    public void consultarHorario() {
        // Implementación
    }
    
    public void consultarNotasEstudiantes() {
        // Implementación
    }
    
    public void cambiarDatos() {
        // Implementación
    }
    
    public void consultarCursos() {
        // Implementación
    }
    
    public void definirHorario() {
        // Implementación
    }
    
    // Getters y Setters
    public long getCodigoDocente() {
        return codigoDocente;
    }
    
    public void setCodigoDocente(long codigoDocente) {
        this.codigoDocente = codigoDocente;
    }
    
    public String getExperiencia() {
        return experiencia;
    }
    
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    
    public Programa getPrograma() {
        return programa;
    }
    
    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
    
    public Persona getPersona() {
        return persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }
    
    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
}
