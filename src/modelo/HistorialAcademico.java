import java.util.List;

public class HistorialAcademico {
    // Atributos
    private List<Asignatura> asignaturasAprobadas;
    private List<Matricula> historial;
    private int creditosAprobados;
    
    // Constructor
    public HistorialAcademico(List<Asignatura> asignaturasAprobadas, List<Matricula> historial, 
                             int creditosAprobados) {
        this.asignaturasAprobadas = asignaturasAprobadas;
        this.historial = historial;
        this.creditosAprobados = creditosAprobados;
    }
    
    // Métodos
    public void calcularCreditosAprobados() {
        // Implementación
    }
    
    // Getters y Setters
    public List<Asignatura> getAsignaturasAprobadas() {
        return asignaturasAprobadas;
    }
    
    public void setAsignaturasAprobadas(List<Asignatura> asignaturasAprobadas) {
        this.asignaturasAprobadas = asignaturasAprobadas;
    }
    
    public List<Matricula> getHistorial() {
        return historial;
    }
    
    public void setHistorial(List<Matricula> historial) {
        this.historial = historial;
    }
    
    public int getCreditosAprobados() {
        return creditosAprobados;
    }
    
    public void setCreditosAprobados(int creditosAprobados) {
        this.creditosAprobados = creditosAprobados;
    }
}

