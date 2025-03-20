import java.util.List;
import java.util.Date;

public class PersonalAdministrativo extends Persona {
    // Atributos
    private String cargo;
    private String departamento;
    private List<AsignacionEmpleado> asignaciones;
    
    // Constructor
    public PersonalAdministrativo(String nombre, long cedula, long telefono, Date fechaNacimiento, 
                                 int edad, String correoElectronico, String correoInstitucional, 
                                 String direccion, String sexo, Rol rol, BandejaEntrada bandejaEntrada,
                                 List<Notificacion> notificaciones, String cargo, String departamento,
                                 List<AsignacionEmpleado> asignaciones) {
        super(nombre, cedula, telefono, fechaNacimiento, edad, correoElectronico, 
             correoInstitucional, direccion, sexo, rol, bandejaEntrada, notificaciones);
        this.cargo = cargo;
        this.departamento = departamento;
        this.asignaciones = asignaciones;
    }
    
    // Métodos
    public void generarReporte() {
        // Implementación
    }
    
    public void enviarNotificacion() {
        // Implementación
    }
    
    // Getters y Setters
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public List<AsignacionEmpleado> getAsignaciones() {
        return asignaciones;
    }
    
    public void setAsignaciones(List<AsignacionEmpleado> asignaciones) {
        this.asignaciones = asignaciones;
    }
}