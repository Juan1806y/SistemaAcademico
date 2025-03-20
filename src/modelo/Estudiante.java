public class Estudiante {
    // Atributos
    private long codigoEstudiante;
    private Programa programa;
    private int creditosAprobados;
    private float promedioPonderado;
    private Persona persona;
    private HistorialAcademico historialAnemico; // Nota: parece haber un error en el UML, debería ser historialAcademico
    private Privilegio privilegio;
    
    // Constructor
    public Estudiante(long codigoEstudiante, Programa programa, int creditosAprobados,
                     float promedioPonderado, Persona persona, HistorialAcademico historialAnemico,
                     Privilegio privilegio) {
        this.codigoEstudiante = codigoEstudiante;
        this.programa = programa;
        this.creditosAprobados = creditosAprobados;
        this.promedioPonderado = promedioPonderado;
        this.persona = persona;
        this.historialAnemico = historialAnemico;
        this.privilegio = privilegio;
    }
    
    // Métodos
    public void modificarDatosEstudiante() {
        // Implementación
    }
    
    public void incribirCurso() {
        // Implementación
    }
    
    public void cancelarCurso() {
        // Implementación
    }
    
    public void consultarHistorial() {
        // Implementación
    }
    
    public void desistir() {
        // Implementación
    }
    
    public void calcularPonderado() {
        // Implementación
    }
    
    public void calcularSemestre() {
        // Implementación
    }
    
    // Getters y Setters
    public long getCodigoEstudiante() {
        return codigoEstudiante;
    }
    
    public void setCodigoEstudiante(long codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
    public Programa getPrograma() {
        return programa;
    }
    
    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
    
    public int getCreditosAprobados() {
        return creditosAprobados;
    }
    
    public void setCreditosAprobados(int creditosAprobados) {
        this.creditosAprobados = creditosAprobados;
    }
    
    public float getPromedioPonderado() {
        return promedioPonderado;
    }
    
    public void setPromedioPonderado(float promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }
    
    public Persona getPersona() {
        return persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public HistorialAcademico getHistorialAnemico() {
        return historialAnemico;
    }
    
    public void setHistorialAnemico(HistorialAcademico historialAnemico) {
        this.historialAnemico = historialAnemico;
    }
    
    public Privilegio getPrivilegio() {
        return privilegio;
    }
    
    public void setPrivilegio(Privilegio privilegio) {
        this.privilegio = privilegio;
    }
}
