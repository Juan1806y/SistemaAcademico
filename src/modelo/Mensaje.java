import java.util.Date;
import java.util.List;

public class Mensaje {
    // Atributos
    private Persona remitente;
    private Persona destinatario;
    private String contenido;
    private Date fechaEnvio;
    private boolean leido;
    
    // Constructor
    public Mensaje(Persona remitente, Persona destinatario, String contenido, 
                  Date fechaEnvio, boolean leido) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.leido = leido;
    }
    
    // Métodos
    public void marcarComoLeido() {
        // Implementación
    }
    
    public Mensaje responder(String contenido) {
        // Implementación
        return new Mensaje(this.destinatario, this.remitente, contenido, new Date(), false);
    }
    
    public Mensaje reenviar(List<Usuario> destinatarios) {
        // Implementación (nota: Usuario no está definido en las 10 primeras clases)
        return null;
    }
    
    public void eliminar() {
        // Implementación
    }
    
    // Getters y Setters
    public Persona getRemitente() {
        return remitente;
    }
    
    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }
    
    public Persona getDestinatario() {
        return destinatario;
    }
    
    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public Date getFechaEnvio() {
        return fechaEnvio;
    }
    
    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    
    public boolean isLeido() {
        return leido;
    }
    
    public void setLeido(boolean leido) {
        this.leido = leido;
    }
}