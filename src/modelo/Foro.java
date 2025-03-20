import java.util.Date;
import java.util.List;

public class Foro {
    // Attributes
    private List<Persona> participantes;
    private String tema;
    private String descripcion;
    private Date fechaCreacion;
    private List<Publicacion> publicaciones;
    private List<Foro> foros;
    
    // Constructors
    public Foro() {
    }
    
    public Foro(List<Persona> participantes, String tema, String descripcion, Date fechaCreacion, 
                List<Publicacion> publicaciones, List<Foro> foros) {
        this.participantes = participantes;
        this.tema = tema;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.publicaciones = publicaciones;
        this.foros = foros;
    }
    
    // Methods from UML
    public void agregarTema() {
        // Implementation
    }
    
    public void censurarPublicacion() {
        // Implementation
    }
    
    // Getters and Setters
    public List<Persona> getParticipantes() {
        return participantes;
    }
    
    public void setParticipantes(List<Persona> participantes) {
        this.participantes = participantes;
    }
    
    public String getTema() {
        return tema;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }
    
    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
    public List<Foro> getForos() {
        return foros;
    }
    
    public void setForos(List<Foro> foros) {
        this.foros = foros;
    }
} {
    
}
