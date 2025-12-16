package data;

import model.Registrable;
import model.CentroCultivo;
import model.PlantaProceso;
import model.Proveedor;
import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {

    private List<Registrable> entidades;

    public GestorEntidades(){
        // Inicialización de la colección
        this.entidades = new ArrayList<>();
        cargarEntidadesIniciales();
    }

    private void cargarEntidadesIniciales(){
        // Unidades Operativas (implementan Registrable)
        entidades.add(new CentroCultivo("CC Lenga", "Talcahuano", 1500.0));
        entidades.add(new PlantaProceso("PP Calbuco", "Calbuco", 50000.0));
        // Aquí se podría agregar un Empleado si la clase existe
    }

    /**
     * Recorre la colección de forma polimórfica y aplica lógica diferenciada con instanceof.
     */
    public void recorrerYMostrarEntidades(){
        System.out.println("\n--- GESTION DE ENTIDADES REGISTRABLES ---");

        for (Registrable entidad : this.entidades){ // Referencia de tipo Interfaz (Polimorfismo)

            // Aplicación de INSTANCEOF para lógica diferenciada
            if (entidad instanceof CentroCultivo){
                // Lógica especial de Centros de Cultivo
                System.out.print("[U. Operativa - CULTIVO] ");
                entidad.mostrarResumen();
            } else if (entidad instanceof PlantaProceso){
                // Lógica especial para Plantas de Proceso
                System.out.print("[U. Operativa - PROCESO] ");
                entidad.mostrarResumen();
            } else if (entidad instanceof Proveedor){
                // Lógica especial para Proveedores
                System.out.print("[ENTIDAD EXTERNA] ");
                entidad.mostrarResumen();
            }else{
                // Comportamiento por defecto
                System.out.print("ENTIDAD GENÉRICA] ");
                entidad.mostrarResumen();
            }
    }
}
