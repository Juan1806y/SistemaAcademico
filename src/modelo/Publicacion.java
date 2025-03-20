import java.util.Date;

public class Publicacion {
    // Attributes
    private Date fechaEnvio;
    private Persona autor;
    
    // Constructors
    public Publicacion() {
    }
    
    public Publicacion(Date fechaEnvio, Persona autor) {
        this.fechaEnvio = fechaEnvio;
        this.autor = autor;
    }
    
    // Methods from UML
    public void publicar() {
        // Implementation
    }
    
    public void citar() {
        // Implementation
    }
    
    // Getters and Setters
    public Date getFechaEnvio() {
        return fechaEnvio;
    }
    
    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    
    public Persona getAutor() {
        return autor;
    }
    
    public void setAutor(Persona autor) {
        this.autor = autor;
    }
}