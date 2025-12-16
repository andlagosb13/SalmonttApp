package ui;

import data.GestorEntidades;
import javax.swing.JOptionPane;

public class GUIManager {

    private GestorEntidades gestor;

    public GUIManager(GestorEntidades gestor){
        this.gestor = gestor;
    }

    public void iniciarGUI(){
        String opcion = "";
        while(!opcion.equals("3")){
            opcion = JOptionPane.showInputDialog(
                    "--- Menú Salmontt ---\n" +
                    "1. Ingresar Nueva Entidad\n" +
                    "2. Mostrar Entidades Registradas (Consola)\n" +
                    "3. Salir"
            );

            if (opcion == null){
                opcion = "3"; // Tratar cancelar como salir
            }

            switch (opcion){
                case "1":
                    ingresarNuevaEntidad();
                    break;
                case "2":
                    // La lógica de mostrar está en GestorEntidades, se puede invocar aquí
                    // Para simplificar, la mostramos por consola
                    gestor.recorrerYMostrarEntidades();
                    JOptionPane.showMessageDialog(null, "Revisar Consola para el listado completo.");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema Salmontt. !Adiós¡");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    private void ingresarNuevaEntidad(){
        // Implementación de ingreso básico de una entidad
        String tipo = JOptionPane.showInputDialog("¿Qué tipo de entidad desea ingresar?\n1. Centro de Cultivo\n2. Proveedor");

        if (tipo == null) return;

        if (tipo.equals("1")){
            // Lógica simple para CC (no es un requisito, pero muestra la integración)
            String nombre = JOptionPane.showInputDialog("Nombre del Centro:");
            String comuna = JOptionPane.showInputDialog("Comuna:");
            String prodStr = JOptionPane.showInputDialog("Producción (toneladas):");

            // Simplificado sin validación de Double/Integer, solo para demostración
            // gestor.addEntidad(new CentroCultivo(nombre, comuna, double.parseDouble( prodStr)));
            JOptionPane.showMessageDialog(null, "Centro de Cultivo agregado (simulado).");
        }else if (tipo.equals("2")) {
            // Lógica simple para Proveedor (Requisito de la Semana 8)
            String razonSocial = JOptionPane.showInputDialog("Razón Social del Proveedor:");
            String rut = JOptionPane.showInputDialog("RUT:");
            String tipoServicio = JOptionPane.showInputDialog("Tipo de Servicio:");

            // Aquí se agregaría la instancia a la colección del Gestor
            // gestor.addEntidad(new Proveedor(razonSocial, rut, tipoServicio));
            JOptionPane.showMessageDialog(null, "Proveedor ingresado (Verificar la colección en GestorEntidades).");
           } else {
            JOptionPane.showMessageDialog(null, "Tipo de entidad no válido.");
        }
    }
}
