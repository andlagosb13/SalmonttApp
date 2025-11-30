package service;

import model.Empleado;
import util.ArchivoUtil;
import java.util.ArrayList;

public class SalmoneraService {
    private ArrayList<Empleado> empleados;

    public SalmoneraService(){
        this.empleados = new ArrayList<>();
    }

    public void cargarDesdeArchivo(String ruta){
        this.empleados = ArchivoUtil.leerEmpleados(ruta);
    }

    public void listarTodos(){
        System.out.println("--- Lista de Empleados ---");
        for (Empleado e : empleados){
            System.out.println(e); // Llama al toString()
        }
    }

    // Filtro simple
    public void buscarPorCargo(String cargo){
        System.out.println("--- Buscando cargo: " + cargo + " ---");
        boolean encontrado = false;
        for (Empleado e : empleados){
            if (e.getCargo().equalsIgnoreCase(cargo)){
                System.out.println(e);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontraron empleados con ese cargo.");
    }
}
