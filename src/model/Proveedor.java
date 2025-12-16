package model;

/**
 * * Representa a un Proveedor que suministra servicios a Salmontt.
 * Implementa Registrable para ser gestionado en la colección principal.
 */
public class Proveedor implements Registrable {
    private String razonSocial;
    private String rut;
    private String tipoServicio; // Ejemplo: "Transporte", "Alimentación", etc.}

    public Proveedor(String razonSocial, String rut, String tipoServicio) {
        this.razonSocial = razonSocial;
        this.rut = rut;
        this.tipoServicio = tipoServicio;
    }

    // Getters y Setters

    public String getRazonSocial(){
        return razonSocial;
    }

    public String getRut(){
        return rut;
    }

    // Implementación del método de la interfaz Registrable
    @Override
    public void mostrarResumen() {
        System.out.println("-> REGISTRO (PROVEEDOR): " + this.razonSocial +
                           " | RUT: " + this.rut +
                           " | Tipo: " + this.tipoServicio);
    }
}
