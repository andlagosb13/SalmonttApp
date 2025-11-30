package util;

import model.Direccion;
import model.Empleado;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoUtil {

    public static ArrayList<Empleado> leerEmpleados(String ruta) {
        ArrayList<Empleado> lista = new ArrayList<>();

        // Uso de try-catch para manejo de errores de archivo
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                // Formato CSV esperado: Rut; Nombre; Calle; Numero; Ciudad; Cargo; Sueldo
                if (datos.length == 7) {
                    Direccion dir = new Direccion(datos[2], Integer.parseInt(datos[3]), datos[4]);
                    Empleado emp = new Empleado(datos[0], datos[1], dir, datos[5], Double.parseDouble(datos[6]));
                    lista.add(emp);
                }
            }
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    }
}
