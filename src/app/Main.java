package app;

import service.SalmoneraService;

public class Main{
    public static void main(String[] args){
        SalmoneraService servicio = new SalmoneraService();

        // Cargar datos
        servicio.cargarDesdeArchivo("datos.csv");

        // lista datos
        servicio.listarTodos();

        // filtrar datos
        System.out.println("\n");
        servicio.buscarPorCargo("Asistente Administrativo");
    }
}