package pit2027;

import java.util.Date;

public abstract class Alquiler {
    
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaFin;

    public Alquiler(Vehiculo vehiculo, Cliente cliente, Date fechaInicio, Date fechaFin) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public static Alquiler[] obtenerAlquileres() {
        return new Alquiler[0]; 
    }

    public abstract int calcularPrecioAlquiler(Date fechaInicio, Date fechaFin);

}
