import java.util.List;

public class Curso {
    // Atributos
    private String nombre;
    private String descripcion;
    private String contenido;
    private Docente docente;
    private String objetivos;
    private String competencias;
    private int cupoMaximo;
    private List<EstudianteCurso> estudiantesInscritos;
    private List<HorarioCurso> horario;
    private Asignatura asignatura;
    private Programa programa;
    private String semestreAcademico;
    private char grupo;
    private boolean vacacional;
    
    // Constructor
    public Curso(String nombre, String descripcion, String contenido, Docente docente, 
                String objetivos, String competencias, int cupoMaximo, List<EstudianteCurso> estudiantesInscritos,
                List<HorarioCurso> horario, Asignatura asignatura, Programa programa, 
                String semestreAcademico, char grupo, boolean vacacional) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.contenido = contenido;
        this.docente = docente;
        this.objetivos = objetivos;
        this.competencias = competencias;
        this.cupoMaximo = cupoMaximo;
        this.estudiantesInscritos = estudiantesInscritos;
        this.horario = horario;
        this.asignatura = asignatura;
        this.programa = programa;
        this.semestreAcademico = semestreAcademico;
        this.grupo = grupo;
        this.vacacional = vacacional;
    }
    
    // Métodos
    public void modificarCurso() {
        // Implementación
    }
    
    public void inscribirEstudiante() {
        // Implementación
    }
    
    public void cancelarInscripcion() {
        // Implementación
    }
    
    public void obtenerDetalles() {
        // Implementación
    }
    
    public void crearEvaluacion() {
        // Implementación
    }
    
    public void crearTarea() {
        // Implementación
    }
    
    public void modificarCalificacion() {
        // Implementación
    }
    
    public void generarAsistencia() {
        // Implementación
    }
    
    public void eliminarAsistencia() {
        // Implementación
    }
    
    public void modificarAsistencia() {
        // Implementación
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public Docente getDocente() {
        return docente;
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    
    public String getObjetivos() {
        return objetivos;
    }
    
    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }
    
    public String getCompetencias() {
        return competencias;
    }
    
    public void setCompetencias(String competencias) {
        this.competencias = competencias;
    }
    
    public int getCupoMaximo() {
        return cupoMaximo;
    }
    
    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }
    
    public List<EstudianteCurso> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }
    
    public void setEstudiantesInscritos(List<EstudianteCurso> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }
    
    public List<HorarioCurso> getHorario() {
        return horario;
    }
    
    public void setHorario(List<HorarioCurso> horario) {
        this.horario = horario;
    }
    
    public Asignatura getAsignatura() {
        return asignatura;
    }
    
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
    public Programa getPrograma() {
        return programa;
    }
    
    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
    
    public String getSemestreAcademico() {
        return semestreAcademico;
    }
    
    public void setSemestreAcademico(String semestreAcademico) {
        this.semestreAcademico = semestreAcademico;
    }
    
    public char getGrupo() {
        return grupo;
    }
    
    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }
    
    public boolean isVacacional() {
        return vacacional;
    }
    
    public void setVacacional(boolean vacacional) {
        this.vacacional = vacacional;
    }
}