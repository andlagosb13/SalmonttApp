package model;

// PlantaProceso herede de UnidadOperativa
public class PlantaProceso extends UnidadOperativa{
    // Atributo especifico
    private int capacidadProceso; // Podria ser en toneladas

    // Constructor
    public PlantaProceso(String nombre, String comuna, int capacidadProceso){
        // Llama al constructor de UnidadOperativa
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    // Getter y setter para capacidadProceso

    public int getCapacidadProceso(){
        return capacidadProceso;
    }

    // Sobreescritura del metodo toString() para incluir todos los datos
    @Override
    public String toString(){
        // Llama al super.toString() para obtener los datos heredados, luego agrega el propio.
        return "Planta de Proceso: [" + super.toString() +
                ", Capacidad de Proceso: " + capacidadProceso + " Unidades/Dia]";
    }

    // Nuevo metodo para el polimorfismo
    @Override
    public void mostrarInformacion(){
        System.out.print("Planta de Proceso: [");
        // Llama al metodo de la Superclase para imprimir Nombre y Comuna
        super.mostrarInformacion();
        // Agrega la información específica y el salto de Linea final
        System.out.println(", Capacidad de Proceso: " + this.capacidadProceso + " Unidades/Dia]");
    }
}
