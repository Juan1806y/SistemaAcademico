import java.util.Date;

public class Facturacion {
    // Attributes
    private String numeroFactura;
    private Date fechaEmision;
    private Date fechaVencimiento;
    private Matricula matricula;
    private Estudiante estudiante;
    private Double subtotal;
    private Double descuentos;
    private Double total;
    private String estado; // "Pendiente", "Pagada", "Vencida", "Anulada"
    private String metodoPago;
    private Date fechaPago;
    
    // Constructors
    public Facturacion() {
    }
    
    public Facturacion(String numeroFactura, Date fechaEmision, Date fechaVencimiento, Matricula matricula, 
                       Estudiante estudiante, Double subtotal, Double descuentos, Double total, 
                       String estado, String metodoPago, Date fechaPago) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.matricula = matricula;
        this.estudiante = estudiante;
        this.subtotal = subtotal;
        this.descuentos = descuentos;
        this.total = total;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
    }
    
    // Methods from UML
    public void generarFactura() {
        // Implementation
    }
    
    public void aplicarDescuento(String concepto, Double valor) {
        // Implementation
    }
    
    public void calcularTotal() {
        // Implementation
    }
    
    public void registrarPago(Double monto, String metodoPago) {
        // Implementation
    }
    
    public void enviarFacturaElectronica() {
        // Implementation
    }
    
    public void generarReciboDigital() {
        // Implementation
    }
    
    public String consultarEstado() {
        // Implementation
        return "";
    }
    
    // Getters and Setters
    public String getNumeroFactura() {
        return numeroFactura;
    }
    
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    
    public Date getFechaEmision() {
        return fechaEmision;
    }
    
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public Matricula getMatricula() {
        return matricula;
    }
    
    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public Double getSubtotal() {
        return subtotal;
    }
    
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    
    public Double getDescuentos() {
        return descuentos;
    }
    
    public void setDescuentos(Double descuentos) {
        this.descuentos = descuentos;
    }
    
    public Double getTotal() {
        return total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getMetodoPago() {
        return metodoPago;
    }
    
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public Date getFechaPago() {
        return fechaPago;
    }
    
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
}