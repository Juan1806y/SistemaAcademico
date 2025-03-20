import java.sql.Time;

public class HorarioCurso {
    // Atributos
    private String dia;
    private java.util.Date hora;
    private Aula aula;
    private Curso curso;
    private Time horaInicio;
    private Time horaFin;
    
    // Constructor
    public HorarioCurso(String dia, java.util.Date hora, Aula aula, Curso curso, 
                       Time horaInicio, Time horaFin) {
        this.dia = dia;
        this.hora = hora;
        this.aula = aula;
        this.curso = curso;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    // Métodos
    public void modificarHorario() {
        // Implementación
    }
    
    // Getters y Setters
    public String getDia() {
        return dia;
    }
    
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public java.util.Date getHora() {
        return hora;
    }
    
    public void setHora(java.util.Date hora) {
        this.hora = hora;
    }
    
    public Aula getAula() {
        return aula;
    }
    
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
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