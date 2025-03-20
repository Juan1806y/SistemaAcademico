import java.util.List;

public class AsignacionEmpleado {
    // Atributo modificado
    private PersonalAdministrativo personal;  // Cambiado de Empleado a PersonalAdministrativo
    private List<HorarioEmpleado> horario;
    private int anio;
    
    // Constructores actualizados
    public AsignacionEmpleado() {
    }
    
    public AsignacionEmpleado(PersonalAdministrativo personal, List<HorarioEmpleado> horario, int anio) {
        this.personal = personal;  // Parámetro modificado
        this.horario = horario;
        this.anio = anio;
    }
    
    // Métodos (se mantiene la lógica original)
    public void asignaEmpleado() {
        // Implementación (ahora usaría el atributo 'personal')
    }
    
    public void verificarDisponibilidad() {
        // Implementación
    }
    
    // Getters y Setters actualizados
    public PersonalAdministrativo getPersonal() {  // Nombre cambiado
        return personal;
    }
    
    public void setPersonal(PersonalAdministrativo personal) {  // Nombre y tipo cambiado
        this.personal = personal;
    }
    
    // Resto de getters y setters (sin cambios)
    public List<HorarioEmpleado> getHorario() {
        return horario;
    }
    
    public void setHorario(List<HorarioEmpleado> horario) {
        this.horario = horario;
    }
    
    public int getAnio() {
        return anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
}