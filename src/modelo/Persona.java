import java.util.Date;
import java.util.List;

public class Persona {
    // Atributos
    private String nombre;
    private long cedula;
    private long telefono;
    private Date fechaNacimiento;
    private int edad;
    private String correoElectronico;
    private String correoInstitucional;
    private String direccion;
    private String sexo;
    private Rol rol;
    private BandejaEntrada bandejaEntrada;
    private List<Notificacion> notificaciones;
    
    // Constructor
    public Persona(String nombre, long cedula, long telefono, Date fechaNacimiento, 
                  int edad, String correoElectronico, String correoInstitucional, 
                  String direccion, String sexo, Rol rol, BandejaEntrada bandejaEntrada,
                  List<Notificacion> notificaciones) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.correoInstitucional = correoInstitucional;
        this.direccion = direccion;
        this.sexo = sexo;
        this.rol = rol;
        this.bandejaEntrada = bandejaEntrada;
        this.notificaciones = notificaciones;
    }
    
    // Métodos
    public void eliminarDatos() {
        // Implementación
    }
    
    public void modificarDatos() {
        // Implementación
    }
    
    public void solicitarRecurso() {
        // Implementación
    }
    
    public void desistir() {
        // Implementación
    }
    
    public void publicarTema() {
        // Implementación
    }
    
    public void escribirMensaje() {
        // Implementación
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public long getCedula() {
        return cedula;
    }
    
    public void setCedula(long cedula) {
        this.cedula = cedula;
    }
    
    public long getTelefono() {
        return telefono;
    }
    
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public String getCorreoInstitucional() {
        return correoInstitucional;
    }
    
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Rol getRol() {
        return rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    public BandejaEntrada getBandejaEntrada() {
        return bandejaEntrada;
    }
    
    public void setBandejaEntrada(BandejaEntrada bandejaEntrada) {
        this.bandejaEntrada = bandejaEntrada;
    }
    
    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }
    
    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }
}
