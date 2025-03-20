import java.util.List;

public class BandejaEntrada {
    // Attributes
    private List<Mensaje> mensajesRecibidos;
    private Integer mensajesNoLeidos;

    // Constructors
    public BandejaEntrada() {
    }
    
    public BandejaEntrada(List<Mensaje> mensajesRecibidos, Integer mensajesNoLeidos) {
        this.mensajesRecibidos = mensajesRecibidos;
        this.mensajesNoLeidos = mensajesNoLeidos;
    }
    
    // Methods from UML
    public List<Mensaje> obtenerMensajesNoLeidos() {
        // Implementation
        return null;
    }
    
    public List<Mensaje> buscarMensajes(String criterio) {
        // Implementation
        return null;
    }
    
    // Getters and Setters
    public List<Mensaje> getMensajesRecibidos() {
        return mensajesRecibidos;
    }
    
    public void setMensajesRecibidos(List<Mensaje> mensajesRecibidos) {
        this.mensajesRecibidos = mensajesRecibidos;
    }
    
    public Integer getMensajesNoLeidos() {
        return mensajesNoLeidos;
    }
    
    public void setMensajesNoLeidos(Integer mensajesNoLeidos) {
        this.mensajesNoLeidos = mensajesNoLeidos;
    }
    
}