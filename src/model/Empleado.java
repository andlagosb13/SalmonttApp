package model;

public class Empleado extends Persona implements Registrable {
    private String cargo;
    private double sueldo;

    public Empleado(String rut, String nombre, Direccion direccion, String cargo, double sueldo){
        super(rut, nombre, direccion); // llama al constructor Persona
        this.cargo = cargo;
        setSueldo(sueldo);  // usa el setter para validación
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSueldo(){
        return sueldo;
    }

    // validar que el sueldo no sea negativo
    public void setSueldo(double sueldo){
        try{
            if (sueldo < 0){
                throw new IllegalArgumentException("Sueldo negativo");
            }
            this.sueldo = sueldo;
        }catch (IllegalArgumentException e){
            System.out.println("Error al asignar sueldo: " + e.getMessage());
            this.sueldo =0;  // Asignación por defecto en caso de error
        }
    }

    @Override
    public String toString(){
        return super.toString() + " | Cargo: " + cargo + " | Sueldo: $" + sueldo;
    }

    @Override
    public void mostrarResumen(){
        System.out.println(
                "-> REGISTRO (EMP): " + getNombre() +
                " | Cargo: " + cargo +
                " | Sueldo: $" + sueldo
        );
    }
}