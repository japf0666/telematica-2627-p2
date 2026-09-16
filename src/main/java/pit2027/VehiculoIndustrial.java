package pit2027;

import java.util.Date;

public class VehiculoIndustrial extends Vehiculo {

    private int capacidadCarga;
    private int numeroEjes;
    private int potenciaMotor;

    public VehiculoIndustrial(String matricula, Categoria categoria, int annio,
        int capacidadCarga, int numeroEjes, int potenciaMotor
    ) {
        super(matricula, categoria, annio);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.potenciaMotor = potenciaMotor;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    @Override
    public double calcularPrecioAlquiler(Date fechaInicio, Date fechaFin) {
        return 0.0; 
    }

}
