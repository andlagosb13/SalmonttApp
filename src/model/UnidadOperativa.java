package model;

public class UnidadOperativa {
    // Atributos comunes (heredados)
    private String nombre;
    private String comuna;

    // Constructor de la superclase
    public UnidadOperativa(String nombre, String comuna){
        this.nombre = nombre;
        this.comuna = comuna;
    }

    // Getters y Setters

    public String getNombre(){
        return nombre;
    }

    public String getComuna(){
        return comuna;
    }

    // Metodo toString() base para mostrar información
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Comuna: " + comuna;
    }

    /**
     *  Usamos print() en lugar de println() para permitir que las subclases agreguen sus detalles
     */
    public void mostrarInformacion(){
        // Usamos print() en lugar de println() para permitir que las subclases agreguen sus detalles
        System.out.print("Nombre: " + this.nombre +
                ", Comuna: " + this.comuna);
    }
}