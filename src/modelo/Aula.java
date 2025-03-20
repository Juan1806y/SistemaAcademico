import java.util.List;

public class Aula {
    // Atributos
    private int capacidad;
    private String ubicacion;
    private List<Object> horario; // El tipo específico no está claro en el UML
    private int dimensiones;
    private String tipo;
    private String estado;
    private boolean esExamen;
    
    // Constructor
    public Aula(int capacidad, String ubicacion, List<Object> horario, int dimensiones, 
               String tipo, String estado, boolean esExamen) {
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.dimensiones = dimensiones;
        this.tipo = tipo;
        this.estado = estado;
        this.esExamen = esExamen;
    }
    
    // Métodos
    public void abrir() {
        // Implementación
    }
    
    public void cerrar() {
        // Implementación
    }
    
    public void fechaDisponibilidad() {
        // Implementación
    }
    
    // Getters y Setters
    public int getCapacidad() {
        return capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public List<Object> getHorario() {
        return horario;
    }
    
    public void setHorario(List<Object> horario) {
        this.horario = horario;
    }
    
    public int getDimensiones() {
        return dimensiones;
    }
    
    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public boolean isEsExamen() {
        return esExamen;
    }
    
    public void setEsExamen(boolean esExamen) {
        this.esExamen = esExamen;
    }
}
