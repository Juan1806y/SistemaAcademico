import java.util.Date;

public class Recurso {
    // Attributes
    private String nombre;
    private Date ubicacion;
    private String estadoMateria;
    
    // Constructors
    public Recurso() {
    }
    
    public Recurso(String nombre, Date ubicacion, String estadoMateria) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estadoMateria = estadoMateria;
    }
    
    // Methods from UML
    public void existir() {
        // Implementation
    }
    
    public void desechar() {
        // Implementation
    }
    
    public void crear() {
        // Implementation
    }
    
    // Getters and Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Date getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(Date ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public String getEstadoMateria() {
        return estadoMateria;
    }
    
    public void setEstadoMateria(String estadoMateria) {
        this.estadoMateria = estadoMateria;
    }
}
