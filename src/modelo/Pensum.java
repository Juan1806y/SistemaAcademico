import java.util.List;

public class Pensum {
    // Atributos
    private String nombre;
    private int creditosTotales;
    private List<Asignatura> asignaturas; // Nota: Probablemente debería ser List<Asignatura>
    private int duracion;
    private int anio;
    
    // Constructor
    public Pensum(String nombre, int creditosTotales, List<Asignatura> asignaturas, 
                 int duracion, int anio) {
        this.nombre = nombre;
        this.creditosTotales = creditosTotales;
        this.asignaturas = asignaturas;
        this.duracion = duracion;
        this.anio = anio;
    }
    
    // Métodos
    public void agregarAsignatura() {
        // Implementación
    }
    
    public void eliminarAsignatura() {
        // Implementación
    }
    
    public void modificarPensum() {
        // Implementación
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCreditosTotales() {
        return creditosTotales;
    }
    
    public void setCreditosTotales(int creditosTotales) {
        this.creditosTotales = creditosTotales;
    }
    
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    
    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public int getAnio() {
        return anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
}