package model;

// CentroCultivo ahora implementa la interfaz Registrable

public class CentroCultivo extends UnidadOperativa implements Registrable {

    private double toneladasProduccion;

    // Constructor: Debe usar super(...) para inicializar los atributos heredados
    public CentroCultivo(String nombre, String comuna, double toneladasProduccion){
        // llama al constructor de UnidadOperativa
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    // Getter y Setter para toneladasProduccion

    public double getToneladasProduccion() {
        return toneladasProduccion;
    }

    // Sobreescritura del metodo toString() para incluir todos los datos
    @Override
    public void mostrarInformacion() {
         System.out.print("Centro de Cultivo: [");
         super.mostrarInformacion();
         System.out.println(", Producción: " + this.toneladasProduccion + " Toneladas]");
    }

    // Nuevo metodo especifico de Centro de Cultivo
    @Override
    public void mostrarResumen(){
        // Se puede reutilizar la lógica ya existente o crear un resumen conciso
        System.out.println("-> REGISTRO (CC): " + this.getNombre() + " (" + this.getComuna() + ")");
    }
}

