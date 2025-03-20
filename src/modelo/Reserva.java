import java.util.Date;

public class Reserva {
    // Atributos
    private Persona usuario;
    private Date dia;
    private Date horaInicio;
    private Date horaFin;
    private Recurso recurso;
    
    // Constructor
    public Reserva(Persona usuario, Date dia, Date horaInicio, Date horaFin, Recurso recurso) {
        this.usuario = usuario;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.recurso = recurso;
    }
    
    // Métodos
    public void confirmarReserva() {
        // Implementación
    }
    
    public void cancelarReserva() {
        // Implementación
    }
    
    public void asignarHorario() {
        // Implementación
    }
    
    // Getters y Setters
    public Persona getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }
    
    public Date getDia() {
        return dia;
    }
    
    public void setDia(Date dia) {
        this.dia = dia;
    }
    
    public Date getHoraInicio() {
        return horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public Date getHoraFin() {
        return horaFin;
    }
    
    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }
    
    public Recurso getRecurso() {
        return recurso;
    }
    
    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
}