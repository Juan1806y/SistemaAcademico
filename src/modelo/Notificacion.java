import java.util.Date;

public class Notificacion {
    // Atributos
    private String preView;
    private Date fechaEnvio;
    private Mensaje mensaje;
    
    // Constructor
    public Notificacion(String preView, Date fechaEnvio, Mensaje mensaje) {
        this.preView = preView;
        this.fechaEnvio = fechaEnvio;
        this.mensaje = mensaje;
    }
    
    // Métodos
    public void enviarNotificacion() {
        // Implementación
    }
    
    public void marcarComoAbierto() {
        // Implementación
    }
    
    // Getters y Setters
    public String getPreView() {
        return preView;
    }
    
    public void setPreView(String preView) {
        this.preView = preView;
    }
    
    public Date getFechaEnvio() {
        return fechaEnvio;
    }
    
    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    
    public Mensaje getMensaje() {
        return mensaje;
    }
    
    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }
}