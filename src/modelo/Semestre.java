import java.util.Date;

public class Semestre {
    // Atributos
    private Date fechaInicio;
    private Date fechaFin;
    private int anio;
    private int periodo;
    
    // Constructor
    public Semestre(Date fechaInicio, Date fechaFin, int anio, int periodo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.anio = anio;
        this.periodo = periodo;
    }
    
    // Métodos
    public void consultarSemestre() {
        // Implementación
    }
    
    // Getters y Setters
    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaFin() {
        return fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public int getAnio() {
        return anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int getPeriodo() {
        return periodo;
    }
    
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
}