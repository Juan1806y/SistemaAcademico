public class Programa {
    // Atributos
    private String nombre;
    private int codigo;
    private Pensum pensum;
    private int creditos;
    private String faculta; // Nota: probablemente debería ser "facultad"
    
    // Constructor
    public Programa(String nombre, int codigo, Pensum pensum, int creditos, String faculta) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.pensum = pensum;
        this.creditos = creditos;
        this.faculta = faculta;
    }
    
    // Métodos
    public void modificarPrograma() {
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
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Pensum getPensum() {
        return pensum;
    }
    
    public void setPensum(Pensum pensum) {
        this.pensum = pensum;
    }
    
    public int getCreditos() {
        return creditos;
    }
    
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public String getFaculta() {
        return faculta;
    }
    
    public void setFaculta(String faculta) {
        this.faculta = faculta;
    }
}