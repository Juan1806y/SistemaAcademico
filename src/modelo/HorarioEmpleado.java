import java.sql.Time;

public class HorarioEmpleado {
    // Atributos
    private String dia;
    private String departamento;
    private Time horaInicio;
    private Time horaFin;
    
    // Constructor
    public HorarioEmpleado(String dia, String departamento, Time horaInicio, Time horaFin) {
        this.dia = dia;
        this.departamento = departamento;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    // Métodos
    public void generarHorario() {
        // Implementación
    }
    
    // Getters y Setters
    public String getDia() {
        return dia;
    }
    
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public Time getHoraInicio() {
        return horaInicio;
    }
    
    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public Time getHoraFin() {
        return horaFin;
    }
    
    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }
}