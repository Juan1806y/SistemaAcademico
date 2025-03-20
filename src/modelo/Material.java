public class Material {
    // Atributos
    private String nombre;
    private String estado;
    private String tipo;
    
    // Constructor
    public Material(String nombre, String estado, String tipo) {
        this.nombre = nombre;
        this.estado = estado;
        this.tipo = tipo;
    }
    
    // Métodos
    public void reservar() {
        // Implementación
    }
    
    public void liberar() {
        // Implementación
    }
    
    public void devolver() {
        // Implementación
    }
    
    public void crearRecurso() {
        // Implementación
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}