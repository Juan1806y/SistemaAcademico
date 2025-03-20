import java.util.List;

public class Rol {
    // Attributes
    private List<Privilegio> privilegios;
    private int nivelAcceso;
    private String modulo;
    
    // Constructors
    public Rol() {
    }
    
    public Rol(List<Privilegio> privilegios, int nivelAcceso, String modulo) {
        this.privilegios = privilegios;
        this.nivelAcceso = nivelAcceso;
        this.modulo = modulo;
    }
    
    // Methods from UML
    public void agregarPrivilegio() {
        // Implementation
    }
    
    public void eliminarPrivilegio() {
        // Implementation
    }
    
    public void actualizarPrivilegio() {
        // Implementation
    }
    
    public boolean consultarPrivilegio() {
        // Implementation
        return false;
    }
    
    // Getters and Setters
    public List<Privilegio> getPrivilegios() {
        return privilegios;
    }
    
    public void setPrivilegios(List<Privilegio> privilegios) {
        this.privilegios = privilegios;
    }
    
    public int getNivelAcceso() {
        return nivelAcceso;
    }
    
    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
    
    public String getModulo() {
        return modulo;
    }
    
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
}
